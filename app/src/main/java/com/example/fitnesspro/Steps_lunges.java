package com.example.fitnesspro;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Steps_lunges extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("STEPS: ");
        builder.setMessage("1.Start in a standing position.\n" +
                "2.Take a big step forward with your right leg.\n" +
                "3.Lower your body until your right knee is at a 90-degree angle\n" +
                "4.Push yourself upwards with your right foot.\n5.Repeat this.");
        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
