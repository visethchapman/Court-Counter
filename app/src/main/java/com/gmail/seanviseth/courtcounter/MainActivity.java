package com.gmail.seanviseth.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a = 0, score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreeTeamA(View view) {
        score_a += 3;
        displayScoreTeamA(score_a);
    }

    public void plusTwoTeamA(View view) {
        score_a += 2;
        displayScoreTeamA(score_a);
    }

    public void plusOneTeamA(View view) {
        score_a += 1;
        displayScoreTeamA(score_a);
    }

    public void displayScoreTeamA(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText("" + score);
    }

    public void plusThreeTeamB(View view) {
        score_b += 3;
        displayScoreTeamB(score_b);
    }

    public void plusTwoTeamB(View view) {
        score_b += 2;
        displayScoreTeamB(score_b);
    }

    public void plusOneTeamB(View view) {
        score_b += 1;
        displayScoreTeamB(score_b);
    }

    public void displayScoreTeamB(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText("" + score);
    }

    public void resetScore(View view) {
       score_a = 0;
       score_b = 0;
       displayScoreTeamA(score_a);
       displayScoreTeamB(score_b);
    }

}
