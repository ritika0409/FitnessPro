package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class thursday extends AppCompatActivity {
    Button pushups,sprint,sideplank,lunges;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);
        pushups=(Button)findViewById(R.id.but_pushup);
        sprint=(Button)findViewById(R.id.but_sprint);
        sideplank=(Button)findViewById(R.id.but_sideplank);
        lunges=(Button)findViewById(R.id.but_lunges);
        pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pushIntent=new Intent(thursday.this,pushup.class);
                startActivity(pushIntent);
            }
        });
        sprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sprintIntent=new Intent(thursday.this,sprint.class);
                startActivity(sprintIntent);
            }
        });
        sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sideplankIntent=new Intent(thursday.this,sideplank.class);
                startActivity(sideplankIntent);
            }
        });
        lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lungesIntent=new Intent(thursday.this,lunges.class);
                startActivity(lungesIntent);
            }
        });
    }
}