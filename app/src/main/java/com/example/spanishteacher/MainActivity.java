package com.example.spanishteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button greeting;
    Button slang;
    Button colour;
    Button weekday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greeting=findViewById(R.id.button);
        slang=findViewById(R.id.button3);
        colour=findViewById(R.id.button4);
        weekday=findViewById(R.id.button2);

        greeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Greetings.class);
                startActivity((i));
            }
        });

        weekday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),WeekDays.class);
                startActivity(i);
            }
        });

        slang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Slangs.class);
                startActivity(i);
            }
        });

        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Colours.class);
                startActivity(i);
            }
        });


    }
}