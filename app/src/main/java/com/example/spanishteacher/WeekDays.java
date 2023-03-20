package com.example.spanishteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeekDays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_days);

    }

    public void SayTheVoice(View view) {
        Button clicked_btn = (Button) view;
        MediaPlayer mp = MediaPlayer.create(this,
                getResources().getIdentifier(
                        clicked_btn.getTag().toString(), "raw", getPackageName()));
        mp.start();
    }
}