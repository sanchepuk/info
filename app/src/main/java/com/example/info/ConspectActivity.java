package com.example.info;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ConspectActivity extends Activity {
    Button btn_left;
    Button btn_right;
    Button btn_exit;
    TextView title_small;
    TextView title_big;
    Intent memory;
    Conspect[] conspects;
    int now;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conspect_menu);
        btn_left = findViewById(R.id.left);
        btn_right = findViewById(R.id.right);
        btn_exit = findViewById(R.id.exit);
        title_small = findViewById(R.id.title_small);
        title_big = findViewById(R.id.title_big);
        memory = getIntent();
        conspects = new Conspect[21];
        now = memory.getIntExtra("now", 0);
        init();
        repaint();
        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conspects[now].layout.setVisibility(View.GONE);
                now--;
                repaint();
            }
        });
        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conspects[now].layout.setVisibility(View.GONE);
                now++;
                repaint();
            }
        });


        btn_exit.setOnClickListener(view -> {
            finish();
        });
    }
    void init(){
        conspects[0] = new Conspect(findViewById(R.id.c0), ((Button)findViewById(R.id.b0)).getText().toString());
        conspects[1] = new Conspect(findViewById(R.id.c1), ((Button)findViewById(R.id.b1)).getText().toString());
        conspects[2] = new Conspect(findViewById(R.id.c2), ((Button)findViewById(R.id.b2)).getText().toString());
        conspects[3] = new Conspect(findViewById(R.id.c3), ((Button)findViewById(R.id.b3)).getText().toString());
        conspects[4] = new Conspect(findViewById(R.id.c4), ((Button)findViewById(R.id.b4)).getText().toString());
        conspects[5] = new Conspect(findViewById(R.id.c5), ((Button)findViewById(R.id.b5)).getText().toString());
        conspects[6] = new Conspect(findViewById(R.id.c6), ((Button)findViewById(R.id.b6)).getText().toString());
        conspects[7] = new Conspect(findViewById(R.id.c7), ((Button)findViewById(R.id.b7)).getText().toString());
        conspects[8] = new Conspect(findViewById(R.id.c8), ((Button)findViewById(R.id.b8)).getText().toString());
        conspects[9] = new Conspect(findViewById(R.id.c9), ((Button)findViewById(R.id.b9)).getText().toString());
        conspects[10] = new Conspect(findViewById(R.id.c10), ((Button)findViewById(R.id.b10)).getText().toString());
        conspects[11] = new Conspect(findViewById(R.id.c11), ((Button)findViewById(R.id.b11)).getText().toString());
        conspects[12] = new Conspect(findViewById(R.id.c12), ((Button)findViewById(R.id.b12)).getText().toString());
        conspects[13] = new Conspect(findViewById(R.id.c13), ((Button)findViewById(R.id.b13)).getText().toString());
        conspects[14] = new Conspect(findViewById(R.id.c14), ((Button)findViewById(R.id.b14)).getText().toString());
    }
    void repaint(){
        conspects[now].layout.setVisibility(View.VISIBLE);
        title_small.setText(conspects[now].title);
        if (memory.getIntExtra("layout", 0) == 0){
            title_big.setText(R.string.teory);
        }else{
            title_big.setText(R.string.practic);
        }
        title_small.setVisibility(View.VISIBLE);
        btn_left.setVisibility(View.VISIBLE);
        btn_right.setVisibility(View.VISIBLE);
        if (now == 0){
            btn_left.setVisibility(View.INVISIBLE);
        }else if (now == 14){
            btn_right.setVisibility(View.INVISIBLE);
        }
    }
}
