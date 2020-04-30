package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class saturday extends AppCompatActivity {
    Button pushups,crunches,squats,sprint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);
        pushups=(Button)findViewById(R.id.but_pushup);
        crunches=(Button)findViewById(R.id.but_crunches);
        squats=(Button)findViewById(R.id.but_squats);
        sprint=(Button)findViewById(R.id.but_sprint);
        pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pushIntent=new Intent(saturday.this,pushup.class);
                startActivity(pushIntent);
            }
        });
        crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crunchIntent=new Intent(saturday.this,crunches.class);
                startActivity(crunchIntent);
            }
        });
        squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent squatsIntent=new Intent(saturday.this,squats.class);
                startActivity(squatsIntent);
            }
        });

        sprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sprintIntent=new Intent(saturday.this, sprint.class);
                startActivity(sprintIntent);
            }
        });
    }
}