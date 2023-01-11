package com.example.info;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.annotation.Nullable;

public class ConspectMenuActivity extends Activity {
    Button btn;
    ScrollView scrollView;
    View v;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scrollView = findViewById(R.id.sc);
        setContentView(R.layout.conspect_menu);
        btn = findViewById(R.id.exit);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        if (getIntent().getIntExtra("layout", 0) == 0){
           v = findViewById(R.id.l_id);
        }else{
            v = findViewById(R.id.l_id_python);
        }
        v.setVisibility(View.VISIBLE);
        findViewById(R.id.b0).setOnClickListener(onClickListener);
        findViewById(R.id.b1).setOnClickListener(onClickListener);
        findViewById(R.id.b2).setOnClickListener(onClickListener);
        findViewById(R.id.b3).setOnClickListener(onClickListener);
        findViewById(R.id.b4).setOnClickListener(onClickListener);
        findViewById(R.id.b5).setOnClickListener(onClickListener);
        findViewById(R.id.b6).setOnClickListener(onClickListener);
        findViewById(R.id.b7).setOnClickListener(onClickListener);
        findViewById(R.id.b8).setOnClickListener(onClickListener);
        findViewById(R.id.b9).setOnClickListener(onClickListener);
        findViewById(R.id.b10).setOnClickListener(onClickListener);
        findViewById(R.id.b11).setOnClickListener(onClickListener);
        findViewById(R.id.b12).setOnClickListener(onClickListener);
        findViewById(R.id.b13).setOnClickListener(onClickListener);
        findViewById(R.id.b14).setOnClickListener(onClickListener);
        findViewById(R.id.b15).setOnClickListener(onClickListener);
        findViewById(R.id.b16).setOnClickListener(onClickListener);
        findViewById(R.id.b17).setOnClickListener(onClickListener);
        findViewById(R.id.b18).setOnClickListener(onClickListener);
        findViewById(R.id.b19).setOnClickListener(onClickListener);
        findViewById(R.id.b20).setOnClickListener(onClickListener);

        btn.setOnClickListener(view -> {
            finish();
        });
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(ConspectMenuActivity.this, ConspectActivity.class);
            switch (view.getId()) {
                case R.id.b0:
                    intent.putExtra("now", 0);
                    startActivity(intent);
                    break;
                case R.id.b1:
                    intent.putExtra("now", 1);
                    startActivity(intent);
                    break;
                case R.id.b2:
                    intent.putExtra("now", 2);
                    startActivity(intent);
                    break;
                case R.id.b3:
                    intent.putExtra("now", 3);
                    startActivity(intent);
                    break;
                case R.id.b4:
                    intent.putExtra("now", 4);
                    startActivity(intent);
                    break;
                case R.id.b5:
                    intent.putExtra("now", 5);
                    startActivity(intent);
                    break;
                case R.id.b6:
                    intent.putExtra("now", 6);
                    startActivity(intent);
                    break;
                case R.id.b7:
                    intent.putExtra("now", 7);
                    startActivity(intent);
                    break;
                case R.id.b8:
                    intent.putExtra("now", 8);
                    startActivity(intent);
                    break;
                case R.id.b9:
                    intent.putExtra("now", 9);
                    startActivity(intent);
                    break;
                case R.id.b10:
                    intent.putExtra("now", 10);
                    startActivity(intent);
                    break;
                case R.id.b11:
                    intent.putExtra("now", 11);
                    startActivity(intent);
                    break;
                case R.id.b12:
                    intent.putExtra("now", 12);
                    startActivity(intent);
                    break;
                case R.id.b13:
                    intent.putExtra("now", 13);
                    startActivity(intent);
                    break;
                case R.id.b14:
                    intent.putExtra("now", 14);
                    startActivity(intent);
                    break;
                case R.id.b15:
                    intent.putExtra("now", 15);
                    startActivity(intent);
                    break;
                case R.id.b16:
                    intent.putExtra("now", 16);
                    startActivity(intent);
                    break;
                case R.id.b17:
                    intent.putExtra("now", 17);
                    startActivity(intent);
                    break;
                case R.id.b18:
                    intent.putExtra("now", 18);
                    startActivity(intent);
                    break;
                case R.id.b19:
                    intent.putExtra("now", 19);
                    startActivity(intent);
                    break;
                case R.id.b20:
                    intent.putExtra("now", 20);
                    startActivity(intent);
                    break;
            }
        }

    };
}
