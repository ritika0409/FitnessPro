package com.example.fitnesspro;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Steps_sprint extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("STEPS: ");
        builder.setMessage("1.Start by jogging for at least 5 minutes, and then incorporate some dynamic stretching drills, including high knees, butt kicks, walking lunges, and skips.\n" +
                "2.Once your body is warm, stretch your major muscle groups.\n" +
                "3.Run short-distance sprints.\n");
        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
