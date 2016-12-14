package com.bignerdranch.android.receiptpic;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReceiptPicActivity extends AppCompatActivity {

        private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_pic);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run(){
                Intent homeIntent = new Intent (ReceiptPicActivity.this, Homeactivity.class);
                startActivity(homeIntent);
                finish();
            }


        },SPLASH_TIME_OUT);
    }
}
