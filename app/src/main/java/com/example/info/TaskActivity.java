package com.example.info;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.Inflater;

public class TaskActivity extends Activity {
    EditText res_txt;
    Button exit;
    Button continue_btn;
    LinearLayout sc;
    int num_task = 0;
    Task tasks [][] = new Task[10][2];
    LayoutInflater inflater;
    Random random;
    int result = 0;
    String now_res;
    int task = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task);
        init();
        random = new Random();
        res_txt = findViewById(R.id.res_txt);
        sc = findViewById(R.id.layout);
        exit = findViewById(R.id.navigate);
        continue_btn = findViewById(R.id.continue_btn);
        inflater = getLayoutInflater();
        repaint();
        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                now_res = res_txt.getText().toString().trim();
                if (tasks[num_task][task].result.equals(now_res)) {
                    result++;
                }
                if (num_task >= 9){
                    Intent intent = new Intent(TaskActivity.this, ResultActivity.class);
                    intent.putExtra("result", result);
                    startActivity(intent);
                    finish ();
                }else {
                    num_task++;
                    repaint();
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public int rand(final double max)
    {
        return (int) (Math.random() * max);
    }

    void repaint(){
        sc.removeAllViews();
        task = rand(2);
        Task now_task = tasks[num_task][task];
        View block = inflater.inflate(R.layout.text_block_small, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(now_task.txt);
        sc.addView(block);
        if (now_task.image != -1){
            block = inflater.inflate(R.layout.image_block, null);
            ImageView image = block.findViewById(R.id.image);
            image.setImageResource(now_task.image);
            sc.addView(block);
        }
        res_txt.setText("");
    }

    void init(){
        tasks[0][0] = new Task(R.string.task10, R.string.res10, this);
        tasks[0][1] = new Task(R.string.task11, R.string.res11, this);

        tasks[1][0] = new Task(R.string.task20, R.string.res20, R.drawable.task20, this);
        tasks[1][1] = new Task(R.string.task21, R.string.res21, R.drawable.task21, this);

        tasks[2][0] = new Task(R.string.task30, R.string.res30, R.drawable.task30, this);
        tasks[2][1] = new Task(R.string.task31, R.string.res31, R.drawable.task31, this);

        tasks[3][0] = new Task(R.string.task40, R.string.res40, R.drawable.task40, this);
        tasks[3][1] = new Task(R.string.task41, R.string.res41, R.drawable.task41, this);

        tasks[4][0] = new Task(R.string.task50, R.string.res50, this);
        tasks[4][1] = new Task(R.string.task51, R.string.res51, this);

        tasks[5][0] = new Task(R.string.task60, R.string.res60, R.drawable.task60, this);
        tasks[5][1] = new Task(R.string.task61, R.string.res61, R.drawable.task61, this);

        tasks[6][0] = new Task(R.string.task70, R.string.res70, this);
        tasks[6][1] = new Task(R.string.task71, R.string.res71, this);

        tasks[7][0] = new Task(R.string.task80, R.string.res80, R.drawable.task80, this);
        tasks[7][1] = new Task(R.string.task81, R.string.res81, R.drawable.task81, this);

        tasks[8][0] = new Task(R.string.task90, R.string.res90, R.drawable.task90, this);
        tasks[8][1] = new Task(R.string.task91, R.string.res91, R.drawable.task91, this);

        tasks[9][0] = new Task(R.string.task100, R.string.res100, R.drawable.task100, this);
        tasks[9][1] = new Task(R.string.task101, R.string.res101, R.drawable.task101, this);
    }
}
