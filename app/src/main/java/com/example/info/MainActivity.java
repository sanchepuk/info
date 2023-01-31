package com.example.info;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//#2D50AE
public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    public static TextView tv;

    Button btn_teory;
    LinearLayout j;
    Button btn_task;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_teory = findViewById(R.id.btn1);
        btn_task = findViewById(R.id.btn2);
        layout = findViewById(R.id.l_id1);
        j = findViewById(R.id.j);
        tv = new TextView(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //j.addView(layout, lp);
        btn_teory.setOnClickListener(view ->{
                Intent intent = new Intent(MainActivity.this, ConspectMenuActivity.class);
                intent.putExtra("layout", 0);
                startActivity(intent);
        });
        btn_task.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this, ConspectMenuActivity.class);
            intent.putExtra("layout", 1);
            startActivity(intent);
        });
    }
}
