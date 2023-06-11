package xyz.norrland.kame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score2);

        //gets intent
        Intent intent = getIntent();

        //gets score
        Score score = (Score) intent.getExtras().getSerializable("xyz.norrland.kame.SCORE");


        //used with, setText can only be int or string. String.format removes unnecessary digits
        String timePerQuestion = String.format("%.2f", ((Double) score.timePerQuestion()));
        String correctPercentage = String.format("%.2f", ((Double) score.correctPercentage()));
        String totalTime = String.format("%.2f", ((Double) score.getTime()));
        String totalQuestions = String.format("%d", ((int) score.getNumberOfQuestions()));
        String rightQuestions = String.format("%d", ((int) score.getRightAnswers()));

        //gets textviews
        TextView answerTime = findViewById(R.id.answerTime);
        TextView numerOfCorrect = findViewById(R.id.numberOfCorrect);

        //changes values, setText can only be int
        answerTime.setText(timePerQuestion+"s"+" (Total: "+totalTime+"s)");
        numerOfCorrect.setText(correctPercentage+"% ("+rightQuestions+"/"+totalQuestions+")");
    }
    public void practiceDone(View view) {
        //Create new intent back to  main
        Intent nextIntent = new Intent(this, MainActivity.class);
        startActivity(nextIntent);
    }
}