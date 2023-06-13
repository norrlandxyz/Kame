package xyz.norrland.kame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class PracticeActivity extends AppCompatActivity {
    //initializes certain variables
    int currentQuestion = 0;
    boolean waitForReset = false;
    int numberOfCorrectAnswers = 0;

    //key to pass score to next scene
    public static final String SCORE = "xyz.norrland.kame.SCORE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);


        //gets intent once, instead of calling it multiple times
        Intent intent = getIntent();

        //get reverse
        boolean reverse = (boolean) intent.getSerializableExtra("xyz.norrland.kame.REVERSE");

        //list of questions
        ArrayList<Question> quizList = (ArrayList<Question>) intent.getSerializableExtra("xyz.norrland.kame.QUIZ_LIST");

        //initializes text where question will be written both by program and user
        TextView quizText = findViewById(R.id.quizText);

        TextView wrongAnswer = findViewById(R.id.wrongAnswer);

        //gets current time
        Long startTime = System.currentTimeMillis();

        EditText answerText = (EditText) findViewById(R.id.answerText);

        ColorStateList DefaultQuizTextColor = quizText.getTextColors();

        //displays first question
        //TODO: make this into a function, as it is usd in multiple places and I am tired of copy pasting
        if (reverse == false) {
            quizText.setText(quizList.get(currentQuestion).getQuestion());
            //answer
            answerText.setHint(R.string.input_hint_romanji);
        }
        else {
            //answer should be in hiragana
            // since this is reverse CorrectAnswer = the question and Question = the answer
            Log.d("match", quizList.get(currentQuestion).getQuestion());
            if (quizList.get(currentQuestion).getQuestion().matches("[\\u3040-\\u309f]+")) {
                answerText.setHint(R.string.input_hint_hiragana);
            }
            //katakana
            else {
                answerText.setHint(R.string.input_hint_katakana);
            }

            quizText.setText(quizList.get(currentQuestion).getCorrectAnswer());
        }


        answerText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                    // Your code logic for handling the Enter key press
                    onEnterPressed(reverse, quizList, answerText, quizText, wrongAnswer, startTime, DefaultQuizTextColor);
                    return true;
                }
                return false;
            }
        });


        /* Auto enter does not work well with all keyboards */
        /*
        answerText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String correctAnswer = null;
                if (reverse == false) {
                    correctAnswer = quizList.get(currentQuestion).getCorrectAnswer();
                }
                else {
                    correctAnswer = quizList.get(currentQuestion).getQuestion();
                }
                if (s.length()>=correctAnswer.length() && !waitForReset) {
                    waitForReset = true;

                    String answerTextToString = answerText.getText().toString();
                    //answer is correct
                    if (quizList.get(currentQuestion).isAnswerCorrect(answerTextToString, reverse)) {
                        numberOfCorrectAnswers++;
                        //changes color of answer to green
                        quizText.setTextColor(Color.parseColor("#00fa9a"));
                        //shows "Correct!" under question
                        Log.i("TAG", "correct");
                        wrongAnswer.setText(R.string.correct_answer_desc);
                    }
                    //answer is false
                    else {
                        //changes color of answer to red
                        quizText.setTextColor(Color.parseColor("#ff6347"));
                        //shows "correct answer:" text
                        wrongAnswer.setText(R.string.incorrect_answer_desc);
                        //adds correct answer to end of text
                        if (reverse == false) {
                            wrongAnswer.append(quizList.get(currentQuestion).getCorrectAnswer());
                        }
                        else {
                            wrongAnswer.append(quizList.get(currentQuestion).getQuestion());
                        }
                        //initializes vibrator
                        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        //vibrates for 500 ms
                        vibrator.vibrate(500);
                    }
                    currentQuestion++;
                    //clear text

                    Handler nextQuestion = new Handler();
                    nextQuestion.postDelayed(new Runnable() {
                        public void run() {
                            //if there are no more questions
                            if (currentQuestion >= quizList.toArray().length-1) {
                                //Needs to be in different method to run properly
                                nextActivity(startTime, quizList, numberOfCorrectAnswers);
                            }
                            else {
                                //displays new question
                                if (reverse == false) {
                                    quizText.setText(quizList.get(currentQuestion).getQuestion());
                                }
                                else {
                                    quizText.setText(quizList.get(currentQuestion).getCorrectAnswer());
                                }
                                //change color back
                                quizText.setTextColor(DefaultQuizTextColor);
                                //reset text color
                                answerText.setText("");
                                //resets "correct answer: (answer)" text
                                wrongAnswer.setText("");
                                //reset boolean
                                waitForReset = false;
                            }
                        }
                    }, 700);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
     */
        //listen for keyboard enter
        /*quizText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Log.i("TAG", "inann input")
                //when enter is pressed or action_down is called
                //(event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Log.i("TAG", "input");
                    checkDone();
                    return true;
                }
                return false;
            }
        }); */
    }
    public void nextActivity(long startTime, ArrayList<Question> quizList, int rightAnswers) {

        //Create new intent towards PracticeActivity
        Intent nextIntent = new Intent(getApplicationContext(), ScoreActivity.class);

        //gets time that went by
        double totalTime = ((System.currentTimeMillis() - startTime)/1000.0);


        //creates new score with stats
        Score score = new Score(totalTime,quizList.toArray().length,rightAnswers);

        //inserts score in intent
        nextIntent.putExtra(SCORE, score);

        //closes this activity. Prevents user from going back and crashing the app.
        finish();

        //Create new intent towards ScoreActivity
        startActivity(nextIntent);
    }

    public void onEnterPressed(boolean reverse, ArrayList<Question> quizList, EditText answerText,
                               TextView quizText, TextView wrongAnswer,
                               Long startTime, ColorStateList DefaultQuizTextColor) {
                /*String correctAnswer = null;
                if (reverse == false) {
                    correctAnswer = quizList.get(currentQuestion).getCorrectAnswer();
                }
                else {
                    correctAnswer = quizList.get(currentQuestion).getQuestion();
                }*/
                /*if (!waitForReset) {
                    waitForReset = true;*/

                    String answerTextToString = answerText.getText().toString();
                    //answer is correct
                    if (quizList.get(currentQuestion).isAnswerCorrect(answerTextToString, reverse)) {
                        numberOfCorrectAnswers++;
                        //changes color of answer to green
                        quizText.setTextColor(Color.parseColor("#00fa9a"));
                        //shows "Correct!" under question
                        Log.i("TAG", "correct");
                        wrongAnswer.setText(R.string.correct_answer_desc);
                    }
                    //answer is false
                    else {
                        //changes color of answer to red
                        quizText.setTextColor(Color.parseColor("#ff6347"));
                        //shows "correct answer:" text
                        wrongAnswer.setText(R.string.incorrect_answer_desc);
                        //adds correct answer to end of text
                        if (reverse == false) {
                            wrongAnswer.append(quizList.get(currentQuestion).getCorrectAnswer());
                        }
                        else {
                            wrongAnswer.append(quizList.get(currentQuestion).getQuestion());
                        }
                        //initializes vibrator
                        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                        //vibrates for 500 ms
                        vibrator.vibrate(500);
                    }
                    currentQuestion++;
                    //clear text

                    Handler nextQuestion = new Handler();
                    nextQuestion.postDelayed(new Runnable() {
                        public void run() {
                            //if there are no more questions
                            if (currentQuestion >= quizList.toArray().length-1) {
                                //Needs to be in different method to run properly
                                nextActivity(startTime, quizList, numberOfCorrectAnswers);
                            }
                            else {
                                //displays new question
                                if (reverse == false) {
                                    quizText.setText(quizList.get(currentQuestion).getQuestion());
                                    //answer
                                    answerText.setHint(R.string.input_hint_romanji);
                                }
                                else {
                                    //answer should be in hiragana
                                    // since this is reverse CorrectAnswer = the question and Question = the answer
                                    Log.d("match", quizList.get(currentQuestion).getQuestion());
                                    if (quizList.get(currentQuestion).getQuestion().matches("[\\u3040-\\u309f]+")) {
                                        answerText.setHint(R.string.input_hint_hiragana);
                                    }
                                    //katakana
                                    else {
                                        answerText.setHint(R.string.input_hint_katakana);
                                    }

                                    quizText.setText(quizList.get(currentQuestion).getCorrectAnswer());
                                }
                                //change color back
                                quizText.setTextColor(DefaultQuizTextColor);
                                //reset text color
                                answerText.setText("");
                                //resets "correct answer: (answer)" text
                                wrongAnswer.setText("");
                                //reset boolean
                                waitForReset = false;
                            }
                        }
                    }, 700);


    }
}