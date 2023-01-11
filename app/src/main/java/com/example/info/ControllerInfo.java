package com.example.info;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ControllerInfo {
    static LayoutInflater inflater;
    static Context context;
    static LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    static void init(LayoutInflater inf, int block, int i, LinearLayout layout, Context c){
        context = c;
        layout.removeAllViews();
        inflater = inf;
        if (block == 0){
            switch (i){
                case 0:
                    layout.addView(getTextBlockBig(getTextString(R.string.teory10)));
                    layout.addView(getTextBlockMedium(getTextString(R.string.teory11)));
                    layout.addView(getFormuleBlock(getTextString(R.string.teory12)));
                    layout.addView(getTextBlockSmall(getTextString(R.string.teory13)));
                    layout.addView(getTextBlockSmall(getTextString(R.string.teory14)));
                    layout.addView(getTextBlockSmall(getTextString(R.string.teory15)));
                    layout.addView(getFormuleBlock(getTextString(R.string.teory110)));
                    break;
            }
        }
    }
    static String getTextString(int id){
        return context.getResources().getString(id);
    }

    @SuppressLint("SetTextI18n")
    static View getTextBlockSmall(String text){
        View block = inflater.inflate(R.layout.text_block_small, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        return block;
    }
    @SuppressLint("SetTextI18n")
    static View getTextBlockMedium(String text){
        View block = inflater.inflate(R.layout.text_block_medium, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        return block;
    }
    @SuppressLint("SetTextI18n")
    static View getTextBlockBig(String text){
        View block = inflater.inflate(R.layout.text_block_big, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        return block;
    }
    @SuppressLint("SetTextI18n")
    static View getFormuleBlock(String text){
        View block = inflater.inflate(R.layout.formule_block, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        return block;
    }
}
