package com.bignerdranch.android.receiptpic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NewMember extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newmember);

        final EditText name = (EditText)findViewById(R.id.nameinput);
        final EditText relation = (EditText)findViewById(R.id.relationinput);
        final EditText budget = (EditText)findViewById(R.id.budgetinput);

        Button b = (Button)findViewById(R.id.addmemberbutton);
        Button b2 = (Button)findViewById(R.id.deletememberbutton);
        Button b3 = (Button)findViewById(R.id.addphotobutton);




        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
                 {

                Intent i = new Intent(NewMember.this, FamilyReceipts.class);
                i.putExtra("nameinput",name.getText().toString());
                i.putExtra("relationinput",relation.getText().toString());
                i.putExtra("budgetinput",budget.getText().toString());
                startActivity(i);

                }
                });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                name.setText("");
                relation.setText("");
                budget.setText("");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(NewMember.this, Pictures.class);
                startActivity(i);
            }
        });


    }





}
