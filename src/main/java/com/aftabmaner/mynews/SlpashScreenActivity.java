package com.aftabmaner.mynews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SlpashScreenActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slpash_screen);
        getSupportActionBar().hide();

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SlpashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);


    }
}