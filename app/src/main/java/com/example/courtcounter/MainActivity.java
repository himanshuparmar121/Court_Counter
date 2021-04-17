package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Display the given score for team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display and add 3 when +3 Points button is clicked in Team A
     */
    public void plusThreeTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display and add 2 when +2 Points button is clicked in Team A
     */
    public void plusTwoTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display and add 1 when FreeThrow button is clicked in Team A
     */
    public void freeThrowTeamA(View view) {
        ++scoreTeamA;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display the given score for team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display and add 3 when +3 Points button is clicked in Team B
     */
    public void plusThreeTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Display and add 2 when +2 Points button is clicked in Team B
     */
    public void plusTwoTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Display and add 1 when FreeThrow button is clicked in Team B
     */
    public void freeThrowTeamB(View view) {
        ++scoreTeamB;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}