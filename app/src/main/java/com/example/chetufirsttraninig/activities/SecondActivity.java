package com.example.chetufirsttraninig.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.chetufirsttraninig.R;
import com.example.chetufirsttraninig.databinding.ActivitySecondBinding;

public class SecondActivity extends BaseActivity {
    private String _tag = "TAG";
    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.d(_tag, "onCreate() in Second class");

        Intent intent = getIntent();
        String input = intent.getStringExtra("input");
        binding.tvResult.setText(input);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(_tag, "onStart() in Second class");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(_tag, "onResume() in Second class");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(_tag, "onPause() in Second class");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(_tag, "onStop() in Second class");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(_tag, "onRestart() in Second class");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(_tag, "onDestroy() in Second class");
    }
}