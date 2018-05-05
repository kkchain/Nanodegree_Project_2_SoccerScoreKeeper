package com.example.kkchain.soccerscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    // Home = Team A
    int goalTeamAScore = 0;
    int foulTeamAScore = 0;
    int yellowTeamAScore = 0;
    int redTeamAScore = 0;

    // Guest = Team B
    int goalTeamBScore = 0;
    int foulTeamBScore = 0;
    int yellowTeamBScore = 0;
    int redTeamBScore = 0;

    TextView team_a_goal, team_a_foul, team_a_yellow, team_a_red;
    TextView team_b_goal, team_b_foul, team_b_yellow, team_b_red;
    TextView goal, foul, yellow, red;
    TextView goalB, foulB, yellowB, redB;
    TextView resetAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create your buttons and set their onClickListener to "this"
        team_a_goal = findViewById(R.id.team_a_goal_button);
        team_a_foul = findViewById(R.id.team_a_foul_button);
        team_a_yellow = findViewById(R.id.team_a_yellow_button);
        team_a_red = findViewById(R.id.team_a_red_button);

        team_b_goal = findViewById(R.id.team_b_goal_button);
        team_b_foul = findViewById(R.id.team_b_foul_button);
        team_b_yellow = findViewById(R.id.team_b_yellow_button);
        team_b_red = findViewById(R.id.team_b_red_button);

        // reset button
        resetAll = findViewById(R.id.reset_button);

        team_a_goal.setOnClickListener(this);
        team_a_foul.setOnClickListener(this);
        team_a_yellow.setOnClickListener(this);
        team_a_red.setOnClickListener(this);

        team_b_goal.setOnClickListener(this);
        team_b_foul.setOnClickListener(this);
        team_b_yellow.setOnClickListener(this);
        team_b_red.setOnClickListener(this);

        resetAll.setOnClickListener(this);

    }

    //Check with button clicked
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.team_a_goal_button:
                goal = findViewById(R.id.goalTeamAScore);
                goalTeamAScore = goalTeamAScore + 1;
                goal.setText(String.valueOf(goalTeamAScore));
                break;

            case R.id.team_a_foul_button:
                foul = findViewById(R.id.foulTeamAScore);
                foulTeamAScore = foulTeamAScore + 1;
                foul.setText(String.valueOf(foulTeamAScore));
                break;

            case R.id.team_a_yellow_button:
                yellow = findViewById(R.id.yellowTeamAScore);
                yellowTeamAScore = yellowTeamAScore + 1;
                yellow.setText(String.valueOf(yellowTeamAScore));
                break;

            case R.id.team_a_red_button:
                red = findViewById(R.id.redTeamAScore);
                redTeamAScore = redTeamAScore + 1;
                red.setText(String.valueOf(redTeamAScore));
                break;

            case R.id.team_b_goal_button:
                goalB = findViewById(R.id.goalTeamBScore);
                goalTeamBScore = goalTeamBScore + 1;
                goalB.setText(String.valueOf(goalTeamBScore));
                break;

            case R.id.team_b_foul_button:
                foulB = findViewById(R.id.foulTeamBScore);
                foulTeamBScore = foulTeamBScore + 1;
                foulB.setText(String.valueOf(foulTeamBScore));
                break;

            case R.id.team_b_yellow_button:
                yellowB = findViewById(R.id.yellowTeamBScore);
                yellowTeamBScore = yellowTeamBScore + 1;
                yellowB.setText(String.valueOf(yellowTeamBScore));
                break;

            case R.id.team_b_red_button:
                redB = findViewById(R.id.redTeamBScore);
                redTeamBScore = redTeamBScore + 1;
                redB.setText(String.valueOf(redTeamBScore));
                break;

        }

        //Reset all scores to zero
        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goalTeamAScore = 0;
                foulTeamAScore = 0;
                yellowTeamAScore = 0;
                redTeamAScore = 0;

                goalTeamBScore = 0;
                foulTeamBScore = 0;
                yellowTeamBScore = 0;
                redTeamBScore = 0;

                goal = findViewById(R.id.goalTeamAScore);
                goal.setText(String.valueOf(goalTeamAScore));
                foul = findViewById(R.id.foulTeamAScore);
                foul.setText(String.valueOf(foulTeamAScore));
                yellow = findViewById(R.id.yellowTeamAScore);
                yellow.setText(String.valueOf(yellowTeamAScore));
                red = findViewById(R.id.redTeamAScore);
                red.setText(String.valueOf(redTeamAScore));

                goal = findViewById(R.id.goalTeamBScore);
                goal.setText(String.valueOf(goalTeamBScore));
                foul = findViewById(R.id.foulTeamBScore);
                foul.setText(String.valueOf(foulTeamBScore));
                yellow = findViewById(R.id.yellowTeamBScore);
                yellow.setText(String.valueOf(yellowTeamBScore));
                red = findViewById(R.id.redTeamBScore);
                red.setText(String.valueOf(redTeamBScore));


            }
        });
    }


}

