package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sideplank extends AppCompatActivity {

    Button step;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sideplank);
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

        Steps_sideplank  steps_sideplanks;
        steps_sideplanks = new Steps_sideplank();
        steps_sideplanks.show(getSupportFragmentManager(),"Steps_sideplanks");
    }
}
