package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class tuesday extends AppCompatActivity {

    Button crunches,pushups,sideplank,sprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);
        crunches=(Button)findViewById(R.id.but_crunches);
        pushups=(Button)findViewById(R.id.but_pushups);
        sideplank=(Button)findViewById(R.id.but_sideplank);
        sprint=(Button)findViewById(R.id.but_sprint);
        crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chrunchesIntent=new Intent(tuesday.this,crunches.class);
                startActivity(chrunchesIntent);
            }
        });
        pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pushIntent=new Intent(tuesday.this,pushup.class);
                startActivity(pushIntent);
            }
        });
        sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sideplankIntent=new Intent(tuesday.this,sideplank.class);
                startActivity(sideplankIntent);
            }
        });
        sprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sprintIntent=new Intent(tuesday.this,sprint.class);
                startActivity(sprintIntent);
            }
        });
    }
}