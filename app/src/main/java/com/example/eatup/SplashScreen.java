package com.example.eatup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);
            Thread thread = new Thread(){
                @Override
                public void run() {
                    try{
                        sleep(SPLASH_TIME_OUT);

                            Intent intent = new Intent(getApplicationContext(), loginpage.class);
                            startActivity(intent);
                        finish();
                        super.run();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };

            thread.start();
    }
}