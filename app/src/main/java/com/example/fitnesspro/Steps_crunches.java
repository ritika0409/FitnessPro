package com.example.fitnesspro;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Steps_crunches extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("STEPS: ");
        builder.setMessage("1.Stand with your feet hip-width apart and hands behind your head and elbows wide.\n" +
                "2.Lift your left knee toward your left elbow while you bend your torso up and over to the left.\n" +
                "3.Repeat on the other side.");
        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog alert =builder.create();
        Button pbutton=alert.getButton(DialogInterface.BUTTON_POSITIVE);
        return builder.create();
    }
}
