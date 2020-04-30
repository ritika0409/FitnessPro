package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Monday extends AppCompatActivity {

    Button push,lunge,squat,sprint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        push=(Button)findViewById(R.id.but_push);
        lunge=(Button)findViewById(R.id.but_lunges);
        squat=(Button)findViewById(R.id.but_squats);
        sprint=(Button)findViewById(R.id.but_sprint);
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pushIntent=new Intent(Monday.this,pushup.class);
                startActivity(pushIntent);
            }
        });
        lunge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lungeIntent=new Intent(Monday.this,lunges.class);
                startActivity(lungeIntent);
            }
        });
        squat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent squatsIntent=new Intent(Monday.this,squats.class);
                startActivity(squatsIntent);
            }
        });
        sprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sprintIntent=new Intent(Monday.this,sprint.class);
                startActivity(sprintIntent);
            }
        });
    }
}
