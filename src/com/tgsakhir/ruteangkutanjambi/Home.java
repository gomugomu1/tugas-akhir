package com.tgsakhir.ruteangkutanjambi;



import android.os.Bundle;
import android.view.View;

import android.app.Activity;
import android.content.Intent;


public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void openrute(View v) {
     	Intent intensaya = new  Intent(getApplicationContext(),
     	RuuteActivity.class);
     startActivity(intensaya);
     }
    public void openclick(View v) {
     	Intent intensaya = new  Intent(getApplicationContext(),
     	CreditActivity.class);
     startActivity(intensaya);
     }
    public void opengal(View v) {
     	Intent intensaya = new  Intent(getApplicationContext(),
     	GalleryActivity.class);
     startActivity(intensaya);
     }
}