package com.example.fitnesspro;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Steps_pushup extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("STEPS: ");
        builder.setMessage("1.Get on the floor on all fours, positioning your hands slightly wider than your shoulders.\n" +
                "2.Extend your legs back so that you are balanced on your hands and toes. Keep your body in a straight line from head to toe.\n" +
                "3.Keep a tight core throughout the entire pushup.\n" +
                "4.Inhale as you slowly bend your elbows and lower yourself until your elbows are at a 90-degree angle.\n" +
                "5.Exhale as you begin contracting your chest muscles and pushing back up through your hands to the start position.");
        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
