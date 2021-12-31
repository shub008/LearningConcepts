package com.example.chetufirsttraninig;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {
    private Button btnSubmit, btn2;
    private Context context;
    private EditText etInput;
    private TextView tvResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = findViewById(R.id.btnSubmit);
//        btn2 = findViewById(R.id.btn2);
        etInput = findViewById(R.id.etInput);
        context =  MainActivity.this;
//        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(this);

//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context,  btn2.getText().toString(), Toast.LENGTH_SHORT).show();
//            }
//        });


        registerForContextMenu(btnSubmit);
    }

    @Override
    public void onClick(View view) {
//        if (!TextUtils.isEmpty(etInput.getText().toString())){
//            tvResult.setVisibility(View.VISIBLE);
//            tvResult.setText(etInput.getText().toString());
//        }else {
//            Toast.makeText(context, "Please enter something", Toast.LENGTH_LONG).show();
//            tvResult.setVisibility(View.GONE);
//        }

        //Todo: Cration of popup menu

//        PopupMenu popupMenu = new PopupMenu(context, btnSubmit);
//        getMenuInflater().inflate(R.menu.options_menu_items, popupMenu.getMenu());
//        popupMenu.setOnMenuItemClickListener(this);
//        popupMenu.show();

        //TODO: onclick event throun xml
        onSubmitButtonClick(view);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.options_menu_items, menu);
        getMenuInflater().inflate(R.menu.options_menu_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:

                break;

            case R.id.item3:

                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.options_menu_items, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:

                break;

            case R.id.item3:

                break;
        }
        return super.onContextItemSelected(item);
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:

                break;

            case R.id.item3:

                break;
        }
        return false;
    }

    private void onSubmitButtonClick(View view){
        Toast.makeText(context, "item.getTitle()", Toast.LENGTH_SHORT).show();
    }
}
