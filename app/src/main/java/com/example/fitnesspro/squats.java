package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class squats extends AppCompatActivity {

    Button step;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squats);
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

        Steps_squats  steps_squats;
        steps_squats = new Steps_squats();
        steps_squats.show(getSupportFragmentManager(),"Steps_squats");
    }
}
