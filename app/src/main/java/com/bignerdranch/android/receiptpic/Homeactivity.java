package com.bignerdranch.android.receiptpic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Homeactivity extends AppCompatActivity {

    Toolbar toolbar;

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private EditText txtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView = (ListView)findViewById(R.id.listv);
        String []items = {"Mortgage","Food","Insurance"};
        arrayList = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.txtitem,arrayList);
        listView.setAdapter(adapter);
        txtInput = (EditText) findViewById(R.id.txtinput);
        Button btadd= (Button)findViewById(R.id.btadd);
        btadd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String newitem=txtInput.getText().toString();
                arrayList.add(newitem);
                adapter.notifyDataSetChanged();
                txtInput.setText("");
            }

        });




    }

    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.addpeoplebutton)
        {
            Intent i = new Intent(Homeactivity.this, NewMember.class);
            startActivity(i);
        }

        else if(v.getId() == R.id.bellbutton)
        {
            Intent p = new Intent(Homeactivity.this, Notifications.class);
            startActivity(p);
        }

        else if(v.getId() == R.id.vacactionbutton)
        {
            Intent p = new Intent(Homeactivity.this, Vacation.class);
            startActivity(p);
        }

        else if(v.getId() == R.id.camerabutton)
        {
            Intent p = new Intent(Homeactivity.this, Pictures.class);
            startActivity(p);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
     int res_id = item.getItemId();
        if (res_id==R.id.action_about)
        {
            Intent p = new Intent(Homeactivity.this, About.class);
            startActivity(p);
        }
        return true;
    }



}
