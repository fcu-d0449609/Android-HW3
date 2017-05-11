package com.example.user.hw3;

import android.content.Intent;
import android.drm.DrmStore;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class GreetingActivity extends AppCompatActivity {

    Button bt_back;
    EditText et_input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bt_back=(Button)findViewById(R.id.bt_back);
        et_input=(EditText)findViewById(R.id.et_input);
        bt_back.setOnClickListener(getmain);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    private View.OnClickListener getmain = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String input=et_input.getText().toString();
            Toast.makeText(GreetingActivity.this,"Hello "+ input, Toast.LENGTH_SHORT).show();
            Intent intent=new Intent();
            intent.setClass(GreetingActivity.this,MainActivity.class);
            startActivity(intent);
        }
    };




}
