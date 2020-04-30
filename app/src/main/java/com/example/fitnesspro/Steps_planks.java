package com.example.fitnesspro;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Steps_planks extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("STEPS: ");
        builder.setMessage("1.Plant hands directly under shoulders.\n" +
                "2.Ground toes into the floor and squeeze glutes to stabilize your body.\n" +
                "3.Neutralize your neck and spine  by looking at a spot on the floor about a foot beyond your hands. Your head should be in line with your back\n"
                +"4.Hold the position for 20 seconds.");
        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
