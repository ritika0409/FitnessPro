package com.example.fitnesspro;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Steps_squats extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("STEPS: ");
        builder.setMessage("1.Stand with your feet apart, directly under your hips, and place your hands on your hips.\n" +
                "2.Standing up tall, put your shoulders back, lift your chest, and pull in your abdominal muscles.\n" +
                "3.Bend your knees while keeping your upper body as straight as possible.\n" +
                "4.Being careful not to lock your knees when you reach a standing position, straighten your legs.");
        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}