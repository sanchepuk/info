package com.example.info;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ConspectActivity extends Activity {
    Button btn_left;
    Button btn_right;
    Button btn_exit;
    TextView title_small;
    TextView title_big;
    Button navigate;
    Intent memory;
    int now_layout;
    LayoutInflater inflater;
    LinearLayout layout;
    Context context;
    int now;
    String []names;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conspect_menu);
        inflater = getLayoutInflater();
        context = this;
        btn_left = findViewById(R.id.left);
        btn_right = findViewById(R.id.right);
        btn_exit = findViewById(R.id.continue_btn);
        title_small = findViewById(R.id.title_small);
        title_big = findViewById(R.id.title_big);
        navigate = findViewById(R.id.navigate);
        memory = getIntent();
        names = new String[15];
        navigate.setVisibility(View.VISIBLE);
        layout = findViewById(R.id.conspect_layout);
        now_layout = memory.getIntExtra("layout", 0);
        now = memory.getIntExtra("now", 0);
        getNames();
        repaint();
        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                now--;
                ControllerInfo.init(inflater, now_layout, now, layout, context);
                repaint();
            }
        });
        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                now++;
                ControllerInfo.init(inflater, now_layout, now, layout, context);
                repaint();
            }
        });

        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                now_layout = (now_layout += 1)% 2;
                repaint();
            }
        });

        btn_exit.setOnClickListener(view -> {
            finish();
        });
    }

    void getNames(){
        names[0] =   ((Button)findViewById(R.id.b0)).getText().toString();
        names[1] =   ((Button)findViewById(R.id.b1)).getText().toString();
        names[2] =   ((Button)findViewById(R.id.b2)).getText().toString();
        names[3] =   ((Button)findViewById(R.id.b3)).getText().toString();
        names[4] =   ((Button)findViewById(R.id.b4)).getText().toString();
        names[5] =   ((Button)findViewById(R.id.b5)).getText().toString();
        names[6] =   ((Button)findViewById(R.id.b6)).getText().toString();
        names[7] =   ((Button)findViewById(R.id.b7)).getText().toString();
        names[8] =   ((Button)findViewById(R.id.b8)).getText().toString();
        names[9] =   ((Button)findViewById(R.id.b9)).getText().toString();
        names[10] =  ((Button)findViewById(R.id.b10)).getText().toString();
        names[11] =  ((Button)findViewById(R.id.b11)).getText().toString();
        names[12] =  ((Button)findViewById(R.id.b12)).getText().toString();
        names[13] =  ((Button)findViewById(R.id.b13)).getText().toString();
        names[14] =  ((Button)findViewById(R.id.b14)).getText().toString();
    }

    void repaint(){
        ControllerInfo.init(inflater, now_layout, now, layout, context);
        navigate.setVisibility(View.VISIBLE);
        title_small.setText(names[now]);
        title_small.setVisibility(View.VISIBLE);
        btn_left.setVisibility(View.VISIBLE);
        btn_right.setVisibility(View.VISIBLE);
        if (now == 0){
            btn_left.setVisibility(View.INVISIBLE);
        }else if (now == 14){
            btn_right.setVisibility(View.INVISIBLE);
        }
        if (now_layout == 0){
            title_big.setText(R.string.teory);
            navigate.setText(R.string.practic);
            if (now > 9) {
                navigate.setVisibility(View.INVISIBLE);
            }
        }else{
            title_big.setText(R.string.practic);
            navigate.setText(R.string.teory);
            if (now == 9){
                btn_right.setVisibility(View.INVISIBLE);
            }
        }
    }
}

