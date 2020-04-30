package com.example.fitnesspro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class pushup extends AppCompatActivity {
    Button step;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup);
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

        Steps_pushup  steps_pushup;
        steps_pushup = new Steps_pushup();
        steps_pushup.show(getSupportFragmentManager(),"Steps_pushup");
    }
}
