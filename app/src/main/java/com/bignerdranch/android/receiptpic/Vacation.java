package com.bignerdranch.android.receiptpic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Talli on 12/10/2016.
 */
public class Vacation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacations);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.imageButton) {
            Intent i = new Intent(Vacation.this, Pictures.class);
            startActivity(i);
        }

    }
}
