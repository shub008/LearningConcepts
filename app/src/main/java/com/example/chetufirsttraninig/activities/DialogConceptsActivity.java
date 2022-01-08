package com.example.chetufirsttraninig.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.example.chetufirsttraninig.R;
import com.example.chetufirsttraninig.databinding.ActivityDialogConceptsBinding;
import com.example.chetufirsttraninig.utility.Utility;

public class DialogConceptsActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityDialogConceptsBinding binding;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDialogConceptsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;

        binding.btnShowDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // 1. Alert dialog

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.app_name);
        builder.setMessage("This is AlertDialog concept.");
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Utility.showToast(context, "positive button clicked");
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Utility.showToast(context, "Negative button clicked");
                dialogInterface.dismiss();
            }
        });
//        builder.setNeutralButton("Nothing", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Utility.showToast(context, "Neutral button is clicked");
//            }
//        });

//        builder.show();
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.text_red));
        alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setAllCaps(false);


    }
}