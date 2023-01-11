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
    Button navigate;
    Intent memory;
    int now_layout;
    Conspect[][] conspects;
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
        navigate = findViewById(R.id.navigate);
        memory = getIntent();
        conspects = new Conspect[2][21];
        now_layout = memory.getIntExtra("layout", 0);
        now = memory.getIntExtra("now", 0);
        init();
        repaint();
        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conspects[now_layout][now].layout.setVisibility(View.GONE);
                now--;
                repaint();
            }
        });
        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conspects[now_layout][now].layout.setVisibility(View.GONE);
                now++;
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
    void init(){
        conspects[0][0] = new Conspect(findViewById(R.id.c0), ((Button)findViewById(R.id.b0)).getText().toString());
        conspects[0][1] = new Conspect(findViewById(R.id.c1), ((Button)findViewById(R.id.b1)).getText().toString());
        conspects[0][2] = new Conspect(findViewById(R.id.c2), ((Button)findViewById(R.id.b2)).getText().toString());
        conspects[0][3] = new Conspect(findViewById(R.id.c3), ((Button)findViewById(R.id.b3)).getText().toString());
        conspects[0][4] = new Conspect(findViewById(R.id.c4), ((Button)findViewById(R.id.b4)).getText().toString());
        conspects[0][5] = new Conspect(findViewById(R.id.c5), ((Button)findViewById(R.id.b5)).getText().toString());
        conspects[0][6] = new Conspect(findViewById(R.id.c6), ((Button)findViewById(R.id.b6)).getText().toString());
        conspects[0][7] = new Conspect(findViewById(R.id.c7), ((Button)findViewById(R.id.b7)).getText().toString());
        conspects[0][8] = new Conspect(findViewById(R.id.c8), ((Button)findViewById(R.id.b8)).getText().toString());
        conspects[0][9] = new Conspect(findViewById(R.id.c9), ((Button)findViewById(R.id.b9)).getText().toString());
        conspects[0][10] = new Conspect(findViewById(R.id.c10), ((Button)findViewById(R.id.b10)).getText().toString());
        conspects[0][11] = new Conspect(findViewById(R.id.c11), ((Button)findViewById(R.id.b11)).getText().toString());
        conspects[0][12] = new Conspect(findViewById(R.id.c12), ((Button)findViewById(R.id.b12)).getText().toString());
        conspects[0][13] = new Conspect(findViewById(R.id.c13), ((Button)findViewById(R.id.b13)).getText().toString());
        conspects[0][14] = new Conspect(findViewById(R.id.c14), ((Button)findViewById(R.id.b14)).getText().toString());
        conspects[1][0] = new Conspect(findViewById(R.id.c0), ((Button)findViewById(R.id.b0)).getText().toString());
        conspects[1][1] = new Conspect(findViewById(R.id.c1), ((Button)findViewById(R.id.b1)).getText().toString());
        conspects[1][2] = new Conspect(findViewById(R.id.c2), ((Button)findViewById(R.id.b2)).getText().toString());
        conspects[1][3] = new Conspect(findViewById(R.id.c3), ((Button)findViewById(R.id.b3)).getText().toString());
        conspects[1][4] = new Conspect(findViewById(R.id.c4), ((Button)findViewById(R.id.b4)).getText().toString());
        conspects[1][5] = new Conspect(findViewById(R.id.c5), ((Button)findViewById(R.id.b5)).getText().toString());
        conspects[1][6] = new Conspect(findViewById(R.id.c6), ((Button)findViewById(R.id.b6)).getText().toString());
        conspects[1][7] = new Conspect(findViewById(R.id.c7), ((Button)findViewById(R.id.b7)).getText().toString());
        conspects[1][8] = new Conspect(findViewById(R.id.c8), ((Button)findViewById(R.id.b8)).getText().toString());
        conspects[1][9] = new Conspect(findViewById(R.id.c9), ((Button)findViewById(R.id.b9)).getText().toString());
        conspects[1][10] = new Conspect(findViewById(R.id.c10), ((Button)findViewById(R.id.b10)).getText().toString());
        conspects[1][11] = new Conspect(findViewById(R.id.c11), ((Button)findViewById(R.id.b11)).getText().toString());
        conspects[1][12] = new Conspect(findViewById(R.id.c12), ((Button)findViewById(R.id.b12)).getText().toString());
        conspects[1][13] = new Conspect(findViewById(R.id.c13), ((Button)findViewById(R.id.b13)).getText().toString());
        conspects[1][14] = new Conspect(findViewById(R.id.c14), ((Button)findViewById(R.id.b14)).getText().toString());
    }
    void repaint(){
        conspects[now_layout][now].layout.setVisibility(View.VISIBLE);
        title_small.setText(conspects[now_layout][now].title);
        if (now_layout == 0){
            title_big.setText(R.string.teory);
            navigate.setText(R.string.practic);
        }else{
            title_big.setText(R.string.practic);
            navigate.setText(R.string.teory);
        }
        title_small.setVisibility(View.VISIBLE);
        btn_left.setVisibility(View.VISIBLE);
        btn_right.setVisibility(View.VISIBLE);
        navigate.setVisibility(View.VISIBLE);
        if (now == 0){
            btn_left.setVisibility(View.INVISIBLE);
        }else if (now == 14){
            btn_right.setVisibility(View.INVISIBLE);
        }
    }
}
