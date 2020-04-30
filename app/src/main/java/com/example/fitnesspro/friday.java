package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class friday extends AppCompatActivity {
    Button planks,crunches,squats,sprint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);
        planks=(Button)findViewById(R.id.but_planks);
        crunches=(Button)findViewById(R.id.but_crunches);
        squats=(Button)findViewById(R.id.but_squats);
        sprint=(Button)findViewById(R.id.but_sprint);
        planks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent planksIntent=new Intent(friday.this,planks.class);
                startActivity(planksIntent);
            }
        });
        crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chrunchIntent=new Intent(friday.this,crunches.class);
                startActivity(chrunchIntent);
            }
        });
        squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent squatsIntent=new Intent(friday.this,squats.class);
                startActivity(squatsIntent);
            }
        });

        sprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sprintIntent=new Intent(friday.this, sprint.class);
                startActivity(sprintIntent);
            }
        });
    }
}
