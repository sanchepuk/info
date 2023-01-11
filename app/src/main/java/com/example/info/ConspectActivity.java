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
        conspects[0] = new Conspect(findViewById(R.id.c0), ((Button)findViewById(R.id.b0)).getText().toString(), "Устройство компьютера");
        conspects[1] = new Conspect(findViewById(R.id.c1), ((Button)findViewById(R.id.b1)).getText().toString(), "Устройство компьютера");
        conspects[2] = new Conspect(findViewById(R.id.c2), ((Button)findViewById(R.id.b2)).getText().toString(), "Устройство компьютера");
        conspects[3] = new Conspect(findViewById(R.id.c3), ((Button)findViewById(R.id.b3)).getText().toString(), "Системы счисления");
        conspects[4] = new Conspect(findViewById(R.id.c4), ((Button)findViewById(R.id.b4)).getText().toString(), "Системы счисления");
        conspects[5] = new Conspect(findViewById(R.id.c5), ((Button)findViewById(R.id.b5)).getText().toString(), "Системы счисления");
        conspects[6] = new Conspect(findViewById(R.id.c6), ((Button)findViewById(R.id.b6)).getText().toString(), "Хранение данных");
        conspects[7] = new Conspect(findViewById(R.id.c7), ((Button)findViewById(R.id.b7)).getText().toString(), "Хранение данных");
        conspects[8] = new Conspect(findViewById(R.id.c8), ((Button)findViewById(R.id.b8)).getText().toString(), "Хранение данных");
        conspects[9] = new Conspect(findViewById(R.id.c9), ((Button)findViewById(R.id.b9)).getText().toString(), "Хранение данных");
        conspects[10] = new Conspect(findViewById(R.id.c10), ((Button)findViewById(R.id.b10)).getText().toString(), "Хранение данных");
        conspects[11] = new Conspect(findViewById(R.id.c11), ((Button)findViewById(R.id.b11)).getText().toString(), "Алгебра логики");
        conspects[12] = new Conspect(findViewById(R.id.c12), ((Button)findViewById(R.id.b12)).getText().toString(), "Алгебра логики");
        conspects[13] = new Conspect(findViewById(R.id.c13), ((Button)findViewById(R.id.b13)).getText().toString(), "Языки программирования");
        conspects[14] = new Conspect(findViewById(R.id.c14), ((Button)findViewById(R.id.b14)).getText().toString(), "Языки программирования");
        conspects[15] = new Conspect(findViewById(R.id.c15), ((Button)findViewById(R.id.b15)).getText().toString(), "Языки программирования");
        conspects[16] = new Conspect(findViewById(R.id.c16), ((Button)findViewById(R.id.b16)).getText().toString(), "Основные понятия");
        conspects[17] = new Conspect(findViewById(R.id.c17), ((Button)findViewById(R.id.b17)).getText().toString(), "Основные понятия");
        conspects[18] = new Conspect(findViewById(R.id.c18), ((Button)findViewById(R.id.b18)).getText().toString(), "Основные понятия");
        conspects[19] = new Conspect(findViewById(R.id.c19), ((Button)findViewById(R.id.b19)).getText().toString(), "Основные понятия");
        conspects[20] = new Conspect(findViewById(R.id.c20), ((Button)findViewById(R.id.b20)).getText().toString(), "Основные понятия");
    }
    void repaint(){
        conspects[now].layout.setVisibility(View.VISIBLE);
        title_small.setText(conspects[now].title);
        title_big.setText(conspects[now].title_big);
        title_small.setVisibility(View.VISIBLE);
        btn_left.setVisibility(View.VISIBLE);
        btn_right.setVisibility(View.VISIBLE);
        if (now == 0 || now == 13){
            btn_left.setVisibility(View.INVISIBLE);
        }else if (now == 12 || now == 20){
            btn_right.setVisibility(View.INVISIBLE);
        }
    }
}
