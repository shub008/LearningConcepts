package com.example.chetufirsttraninig.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.chetufirsttraninig.R;
import com.example.chetufirsttraninig.model.UserDataParceble;
import com.example.chetufirsttraninig.utility.Constants;

public class ThirdPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        UserDataParceble dataParceble = getIntent().getParcelableExtra(Constants.PARCEBLEDATAKEY);

        Log.d("Data", ""+dataParceble);
    }
}