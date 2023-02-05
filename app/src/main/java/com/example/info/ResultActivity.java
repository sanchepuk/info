package com.example.info;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ResultActivity extends Activity {
    TextView tv;
    Button retry;
    Button exit;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_result);
        tv = findViewById(R.id.res);
        retry = findViewById(R.id.retry);
        exit = findViewById(R.id.exit);

        //tv.setText("Результат:\n" + getIntent().getIntExtra("result",0) + " из 10");

        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(ResultActivity.this, TaskActivity.class);
                startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
