package com.tgsakhir.ruteangkutanjambi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(3*1000);
                    Intent i=new Intent(getBaseContext(),Home.class);
                    startActivity(i);
                     
                    finish();
                } catch (Exception e) {}
            }
        };
         
        background.start();
    }
    protected void onDestroy() {
        super.onDestroy();         
    }        
}