package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class wednesday extends AppCompatActivity {
    Button planks,crunches,squats,lunges;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);
        planks=(Button)findViewById(R.id.but_planks);
        crunches=(Button)findViewById(R.id.but_crunches);
        squats=(Button)findViewById(R.id.but_squats);
        lunges=(Button)findViewById(R.id.but_lunges);
        planks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent planksIntent=new Intent(wednesday.this,planks.class);
                startActivity(planksIntent);
            }
        });
        crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chrunchIntent=new Intent(wednesday.this,crunches.class);
                startActivity(chrunchIntent);
            }
        });
        squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent squatsIntent=new Intent(wednesday.this,squats.class);
                startActivity(squatsIntent);
            }
        });
        lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lungesIntent=new Intent(wednesday.this,lunges.class);
                startActivity(lungesIntent);
            }
        });
    }
}
