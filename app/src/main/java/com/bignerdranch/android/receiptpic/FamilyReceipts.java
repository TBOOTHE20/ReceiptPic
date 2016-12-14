package com.bignerdranch.android.receiptpic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Talli on 12/10/2016.
 */
public class FamilyReceipts extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familyreceipts);
        TextView nameView = (TextView)findViewById(R.id.newinfo);
        TextView nameView2 = (TextView)findViewById(R.id.newinfo2);
        TextView nameView3 = (TextView)findViewById(R.id.newinfo3);
        nameView.setText(getIntent().getExtras().getString("nameinput"));
        nameView2.setText(getIntent().getExtras().getString("relationinput"));
        nameView3.setText(getIntent().getExtras().getString("budgetinput"));

    }


    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.addmemberfirststep)
        {
            Intent i = new Intent(FamilyReceipts.this, NewMember.class);
            startActivity(i);
        }
    }


}
