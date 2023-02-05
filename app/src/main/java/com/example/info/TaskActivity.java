package com.example.info;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
    ScrollView sc;
    int num_task = 0;
    List<ArrayList<Task>> tasks = new ArrayList();
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
        /*random = new Random();
        res_txt = findViewById(R.id.res_txt);
        sc = findViewById(R.id.sc);
        exit = findViewById(R.id.navigate);
        continue_btn = findViewById(R.id.continue_btn);

        inflater = getLayoutInflater();
        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tasks.get(num_task).get(task).result == now_res){
                    result++;
                }
                repaint();
                if (num_task > 9){
                    Intent intent = new Intent(TaskActivity.this, ResultActivity.class);
                    intent.putExtra("result", result);
                    startActivity(intent);
                    finish();
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });*/
    }

    void repaint(){
        sc.removeAllViews();
        now_res = res_txt.getText().toString().trim();
        task = random.nextInt() % tasks.get(num_task).size();
        Task now_task = tasks.get(num_task).get(task);
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
        num_task++;
        res_txt.setText("Введите свой ответ");
    }

    void init(){
        for (int i = 0; i < 10; i++){
            tasks.add(new ArrayList<Task>());
        }
        tasks.get(0).add(new Task(R.string.task10, R.string.res10));
        tasks.get(0).add(new Task(R.string.task11, R.string.res11));

        tasks.get(1).add(new Task(R.string.task20, R.string.res20, R.drawable.task20));
        tasks.get(1).add(new Task(R.string.task21, R.string.res21, R.drawable.task21));

        tasks.get(2).add(new Task(R.string.task30, R.string.res30, R.drawable.task30));
        tasks.get(2).add(new Task(R.string.task31, R.string.res31, R.drawable.task31));

        tasks.get(3).add(new Task(R.string.task40, R.string.res40, R.drawable.task40));
        tasks.get(3).add(new Task(R.string.task41, R.string.res41, R.drawable.task41));

        tasks.get(4).add(new Task(R.string.task50, R.string.res50));
        tasks.get(4).add(new Task(R.string.task51, R.string.res51));

        tasks.get(5).add(new Task(R.string.task60, R.string.res60, R.drawable.task60));
        tasks.get(5).add(new Task(R.string.task61, R.string.res61, R.drawable.task61));

        tasks.get(6).add(new Task(R.string.task70, R.string.res70));
        tasks.get(6).add(new Task(R.string.task71, R.string.res71));

        tasks.get(7).add(new Task(R.string.task80, R.string.res80, R.drawable.task80));
        tasks.get(7).add(new Task(R.string.task81, R.string.res81, R.drawable.task81));

        tasks.get(8).add(new Task(R.string.task90, R.string.res90, R.drawable.task90));
        tasks.get(8).add(new Task(R.string.task91, R.string.res91, R.drawable.task91));

        tasks.get(9).add(new Task(R.string.task100, R.string.res100, R.drawable.task100));
        tasks.get(9).add(new Task(R.string.task101, R.string.res101, R.drawable.task101));
    }
}
