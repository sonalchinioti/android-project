package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int scoreForTeamA=0;
    int scoreForTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
    scoreView.setText(String.valueOf(score));
        }
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View view)
    {  scoreForTeamA = scoreForTeamA +3;
        displayForTeamA(scoreForTeamA);

    }
    public void addTwoForTeamA(View view)
    { scoreForTeamA = scoreForTeamA +2;
        displayForTeamA(scoreForTeamA);

    }
    public void addFreePointForTeamA(View view)
    { scoreForTeamA = scoreForTeamA +1;
        displayForTeamA(scoreForTeamA);

    } public void addThreeForTeamB(View view)
    {  scoreForTeamB = scoreForTeamB +3;
        displayForTeamB(scoreForTeamB);

    }
    public void addTwoForTeamB(View view)
    { scoreForTeamB = scoreForTeamB +2;
        displayForTeamB(scoreForTeamB);

    }
    public void addFreePointForTeamB (View view)
    { scoreForTeamB = scoreForTeamB +1;
        displayForTeamB(scoreForTeamB);

    }
    public void resetTeam(View v)
    {scoreForTeamA=0;
        scoreForTeamB=0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
