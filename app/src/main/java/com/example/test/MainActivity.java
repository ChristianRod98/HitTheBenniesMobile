package com.example.test;

import android.content.Intent;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements GameDifficultyDialogFragment.OnGameDifficultySelectedListener{

    ViewGroup tContainer;

    private CountDownTimer mTimer;
    private TextView score_id;
    private ImageButton button1, button2, button3, button4, button5, button6, button7,button8,button9,button10, button11,button12;
    private Menu mMenu;
    private TextView timer_id;
    private long mTimerLength = 30000;
    int score = 0;
    public MediaPlayer minecraftSound;

// Create App Bar and its Actions
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        mMenu = menu;
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        // Determine which menu option was chosen


        if (item.getItemId() == R.id.action_one)
        {
            GameDifficultyDialogFragment dialog = new GameDifficultyDialogFragment();
            dialog.show(getSupportFragmentManager(), "gameDifficultyDialog");
            return true;
        }
        else if (item.getItemId() == R.id.action_stop)
        {
            mTimer.cancel();
            item.setVisible(false);
            mTimer.onFinish();
            return true;
        }
        else if (item.getItemId() == R.id.action_start)
        {
            gameStart();
            mMenu.findItem(R.id.action_stop).setVisible(true);
            return true;
        }
        else if (item.getItemId() == R.id.action_help)
        {
            Intent intent = new Intent(this, HelpActivity.class);
            startActivity(intent);
        }
// create sound effect when images are clicked
        return super.onOptionsItemSelected(item);
    }
    private void playSound()
    {
        if(minecraftSound == null){
            minecraftSound = android.media.MediaPlayer.create(this, R.raw.classic_hurt);

        }
        minecraftSound.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// add a point to score when image clicked
    // add a visibility factor onClick
    private void gameStart() {
        tContainer = findViewById(R.id.transitionContainer);
        mMenu.findItem(R.id.action_stop).setVisible(false);
        score_id = (TextView) findViewById(R.id.score_id);
        button1 = (ImageButton) findViewById(R.id.button1);
        button2 = (ImageButton) findViewById(R.id.button2);
        button3 = (ImageButton) findViewById(R.id.button3);
        button4 = (ImageButton) findViewById(R.id.button4);
        button5 = (ImageButton) findViewById(R.id.button5);
        button6 = (ImageButton) findViewById(R.id.button6);
        button7 = (ImageButton) findViewById(R.id.button7);
        button8 = (ImageButton) findViewById(R.id.button8);
        button9 = (ImageButton) findViewById(R.id.button9);
        button10 = (ImageButton) findViewById(R.id.button10);
        button11 = (ImageButton) findViewById(R.id.button11);
        button12 = (ImageButton) findViewById(R.id.button12);

        timer_id = (TextView) findViewById(R.id.time_id);
        score = 0;
        score_id.setText("Score: " + score);

        button1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button2.setVisibility(visible ? View.VISIBLE: View.GONE);
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button3.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button4.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button5.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button6.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button7.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button8.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button9.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button10.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button11.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button12.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                playSound();
                score++;
                score_id.setText("Score: " + score);
                TransitionManager.beginDelayedTransition(tContainer);
                visible=!visible;
                button1.setVisibility(visible ? View.VISIBLE: View.GONE);
            }
        });


        if (mTimer != null)
        {
            mTimer.cancel();
        }
        mTimer = new CountDownTimer(mTimerLength , 1000)
        {

            public void onTick(long millisUntilFinished)
            {
                timer_id.setText("Time: " + millisUntilFinished/1000);

            }


            public void onFinish()
            {
                mMenu.findItem(R.id.action_stop).setVisible(false);
                button1.setClickable(false);
                button2.setClickable(false);
                button3.setClickable(false);
                button4.setClickable(false);
                button5.setClickable(false);
                button6.setClickable(false);
                button7.setClickable(false);
                button8.setClickable(false);
                button9.setClickable(false);
                button10.setClickable(false);
                button11.setClickable(false);
                button12.setClickable(false);

            }
        }.start();
    }
// timer for difficulty levels
   @Override
    public void onGameDifficultyClick ( int which)
    {
        mTimerLength = 30000 / (which + 1);
    }


}
