package xyz.norrland.kame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Intent extra initialization
    //public static final String EXTRA_MESSAGE = "xyz.norrland.kame.MESSAGE";
    //public static final String OPTION_HIRAGANA = "xyz.norrland.kame.HIRAGANA";
    public static final String QUIZ_LIST = "xyz.norrland.kame.QUIZ_LIST";
    public static final String REVERSE = "xyz.norrland.kame.REVERSE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }*/

    //Activates when "start" button is pressed
    public void practiceStart(View view) {
        //Creates arraylist for all questions. Is an arraylist since it can differ in sice.
        ArrayList<Question> quizList = new ArrayList<Question>();

        //Create new intent towards PracticeActivity
        Intent intent = new Intent(this, PracticeActivity.class);

        //finds value of hiraganaBox
        CheckBox hiraganaBox = (CheckBox) findViewById(R.id.hiraganaBox);

        //finds value of katakanaBox
        CheckBox katakanaBox = (CheckBox) findViewById(R.id.katakanaBox);

        //find reverseBox
        Switch reverseBox = (Switch) findViewById(R.id.reverseBox);
        boolean reverse = false;

        if (reverseBox.isChecked()) {
            reverse = true;
        }

        //if hiraganabox is true, hiragana will be added to list
        if (hiraganaBox.isChecked()) {
            //a
            quizList.add(new Kana("hiragana", "a"));
            quizList.add(new Kana("hiragana", "i"));
            quizList.add(new Kana("hiragana", "u"));
            quizList.add(new Kana("hiragana", "e"));
            quizList.add(new Kana("hiragana", "o"));
            //ka
            quizList.add(new Kana("hiragana", "ka"));
            quizList.add(new Kana("hiragana", "ki"));
            quizList.add(new Kana("hiragana", "ku"));
            quizList.add(new Kana("hiragana", "ke"));
            quizList.add(new Kana("hiragana", "ko"));
            //sa
            quizList.add(new Kana("hiragana", "sa"));
            quizList.add(new Kana("hiragana", "shi"));
            quizList.add(new Kana("hiragana", "su"));
            quizList.add(new Kana("hiragana", "se"));
            quizList.add(new Kana("hiragana", "so"));
            //ta
            quizList.add(new Kana("hiragana", "ta"));
            quizList.add(new Kana("hiragana", "chi"));
            quizList.add(new Kana("hiragana", "tsu"));
            quizList.add(new Kana("hiragana", "te"));
            quizList.add(new Kana("hiragana", "to"));
            //na
            quizList.add(new Kana("hiragana", "na"));
            quizList.add(new Kana("hiragana", "ni"));
            quizList.add(new Kana("hiragana", "nu"));
            quizList.add(new Kana("hiragana", "ne"));
            quizList.add(new Kana("hiragana", "no"));
            //ha
            quizList.add(new Kana("hiragana", "ha"));
            quizList.add(new Kana("hiragana", "hi"));
            quizList.add(new Kana("hiragana", "fu"));
            quizList.add(new Kana("hiragana", "he"));
            quizList.add(new Kana("hiragana", "ho"));
            //ma
            quizList.add(new Kana("hiragana", "ma"));
            quizList.add(new Kana("hiragana", "mi"));
            quizList.add(new Kana("hiragana", "mu"));
            quizList.add(new Kana("hiragana", "me"));
            quizList.add(new Kana("hiragana", "mo"));
            //ya
            quizList.add(new Kana("hiragana", "ya"));
            quizList.add(new Kana("hiragana", "yu"));
            quizList.add(new Kana("hiragana", "yo"));
            //r
            quizList.add(new Kana("hiragana", "ra"));
            quizList.add(new Kana("hiragana", "ri"));
            quizList.add(new Kana("hiragana", "ru"));
            quizList.add(new Kana("hiragana", "re"));
            quizList.add(new Kana("hiragana", "ro"));
            //w
            quizList.add(new Kana("hiragana", "wa"));
            quizList.add(new Kana("hiragana", "wo"));
            //n
            quizList.add(new Kana("hiragana", "n"));
        }
        if (katakanaBox.isChecked()) {
            //a
            quizList.add(new Kana("katakana", "a"));
            quizList.add(new Kana("katakana", "i"));
            quizList.add(new Kana("katakana", "u"));
            quizList.add(new Kana("katakana", "e"));
            quizList.add(new Kana("katakana", "o"));
            //ka
            quizList.add(new Kana("katakana", "ka"));
            quizList.add(new Kana("katakana", "ki"));
            quizList.add(new Kana("katakana", "ku"));
            quizList.add(new Kana("katakana", "ke"));
            quizList.add(new Kana("katakana", "ko"));
            //sa
            quizList.add(new Kana("katakana", "sa"));
            quizList.add(new Kana("katakana", "shi"));
            quizList.add(new Kana("katakana", "su"));
            quizList.add(new Kana("katakana", "se"));
            quizList.add(new Kana("katakana", "so"));
            //ta
            quizList.add(new Kana("katakana", "ta"));
            quizList.add(new Kana("katakana", "chi"));
            quizList.add(new Kana("katakana", "tsu"));
            quizList.add(new Kana("katakana", "te"));
            quizList.add(new Kana("katakana", "to"));
            //na
            quizList.add(new Kana("katakana", "na"));
            quizList.add(new Kana("katakana", "ni"));
            quizList.add(new Kana("katakana", "nu"));
            quizList.add(new Kana("katakana", "ne"));
            quizList.add(new Kana("katakana", "no"));
            //ha
            quizList.add(new Kana("katakana", "ha"));
            quizList.add(new Kana("katakana", "hi"));
            quizList.add(new Kana("katakana", "fu"));
            quizList.add(new Kana("katakana", "he"));
            quizList.add(new Kana("katakana", "ho"));
            //ma
            quizList.add(new Kana("katakana", "ma"));
            quizList.add(new Kana("katakana", "mi"));
            quizList.add(new Kana("katakana", "mu"));
            quizList.add(new Kana("katakana", "me"));
            quizList.add(new Kana("katakana", "mo"));
            //ya
            quizList.add(new Kana("katakana", "ya"));
            quizList.add(new Kana("katakana", "yu"));
            quizList.add(new Kana("katakana", "yo"));
            //r
            quizList.add(new Kana("katakana", "ra"));
            quizList.add(new Kana("katakana", "ri"));
            quizList.add(new Kana("katakana", "ru"));
            quizList.add(new Kana("katakana", "re"));
            quizList.add(new Kana("katakana", "ro"));
            //w
            quizList.add(new Kana("katakana", "wa"));
            quizList.add(new Kana("katakana", "wo"));
            //n
            quizList.add(new Kana("katakana", "n"));
        }

        if (katakanaBox.isChecked() == false && hiraganaBox.isChecked() == false) {
            quizList.add(new Kana("none", "none"));
        }

        //randomize list
        quizList = randomizeQuiz(quizList);

        //Adds extra intents, and then starts PracticeActivity
        intent.putExtra(QUIZ_LIST, quizList);
        intent.putExtra(REVERSE, reverse);
        startActivity(intent);
    }

    public ArrayList<Question> randomizeQuiz (ArrayList<Question> listToRandomize) {
        Log.i("Bruh", String.valueOf(listToRandomize.toArray().length));
        for (int i = 0; i < listToRandomize.toArray().length; i++) {
            //if instance of kana
            if (listToRandomize.get(i) instanceof Kana) {
                //random index between 0 to length
                int randomIndex = new Random().nextInt(listToRandomize.toArray().length);
                //if found object is of type kana
                if (listToRandomize.get(randomIndex) instanceof Kana ) {
                    //downcast to type kana, get temporarily
                    Kana temp = (Kana) listToRandomize.get(randomIndex);

                    //place first object at temp's place
                    listToRandomize.set(randomIndex,listToRandomize.get(i));

                    //place temp object in i variable's old place
                    listToRandomize.set(i,temp);
                }
                else {
                    Log.i("Kame", "Found type is of other type");
                }
            }
            else {
                Log.d("bruh", "randomizeQuiz: UNKOWN TYPE");
            }
        }
        return listToRandomize;
    }

}