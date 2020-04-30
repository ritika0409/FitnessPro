package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workout extends AppCompatActivity {
    Button monday,tuesday,wednesday,thursday,friday,saturday,sunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        monday=(Button)findViewById(R.id.mon);
        tuesday=(Button)findViewById(R.id.tue);
        wednesday=(Button)findViewById(R.id.wed);
        thursday=(Button)findViewById(R.id.thur);
        friday=(Button)findViewById(R.id.fri);
        saturday=(Button)findViewById(R.id.sat);
        sunday=(Button)findViewById(R.id.sun);

        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monIntent= new Intent(workout.this,Monday.class);
                startActivity(monIntent);
            }
        });
        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tueIntent= new Intent(workout.this,tuesday.class);
                startActivity(tueIntent);
            }
        });
        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wedIntent= new Intent(workout.this,wednesday.class);
                startActivity(wedIntent);            }
        });
        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thurIntent= new Intent(workout.this,thursday.class);
                startActivity(thurIntent);               }
        });
        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent friIntent= new Intent(workout.this,friday.class);
                startActivity(friIntent);               }
        });
        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent satIntent= new Intent(workout.this,saturday.class);
                startActivity(satIntent);               }
        });


        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sunIntent= new Intent(workout.this,sunday.class);
                startActivity(sunIntent);               }
        });            }

}