package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lunges extends AppCompatActivity {

    Button step;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunges);
        step=(Button)findViewById(R.id.but_Step);
        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    public void openDialog()
    {

        Steps_lunges  steps_lunges;
        steps_lunges = new Steps_lunges();
        steps_lunges.show(getSupportFragmentManager(),"Steps_lunges");
    }
}
