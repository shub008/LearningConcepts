package com.example.chetufirsttraninig.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.chetufirsttraninig.R;
import com.example.chetufirsttraninig.databinding.ActivityIntentConceptBinding;

public class IntentConceptActivity extends BaseActivity implements View.OnClickListener {
    private String _tag = "TAG";
    private ActivityIntentConceptBinding binding;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntentConceptBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;
        Log.d(_tag, "onCreate() in fist class");

        binding.btnClick.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(_tag, "onStart() in fist class");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(_tag, "onResume() in fist class");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(_tag, "onPause() in fist class");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(_tag, "onStop() in fist class");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(_tag, "onRestart() in fist class");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(_tag, "onDestroy() in fist class");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("input", binding.etInput.getText().toString());
        startActivity(intent);
    }
}