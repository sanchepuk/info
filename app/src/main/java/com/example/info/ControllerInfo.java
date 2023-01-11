package com.example.info;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ControllerInfo {
    static LayoutInflater inflater;
    static Context context;
    static LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    static LinearLayout layout;
    static void init(LayoutInflater inf, int block, int i, LinearLayout lay, Context c){
        context = c;
        layout = lay;
        layout.removeAllViews();
        inflater = inf;
        if (block == 0){
            switch (i){
                case 0:
                    TextBlockBig(getTextString(R.string.teory10));
                    TextBlockMedium(getTextString(R.string.teory11));
                    FormuleBlock(getTextString(R.string.teory12));
                    TextBlockSmall(getTextString(R.string.teory13));
                    TextBlockMedium(getTextString(R.string.teory14));
                    FormuleBlock("2^i >= N");
                    TextBlockSmall(getTextString(R.string.teory15));
                    TextBlockBig(getTextString(R.string.teory16));
                    TextBlockSmall(getTextString(R.string.teory17));
                    TextBlockMedium(getTextString(R.string.teory18));
                    FormuleBlock(getTextString(R.string.teory19));
                    TextBlockSmall(getTextString(R.string.teory111));
                    AttentionBlock(getTextString(R.string.teory112));
                    TextBlockMedium(getTextString(R.string.teory113));
                    TextBlockSmall(getTextString(R.string.teory114));
                    TextBlockBig("1");
                    AttentionBlock(getTextString(R.string.teory115));
                    ExampleBlock(getTextString(R.string.teory116));
                    TextBlockBig("2");
                    AttentionBlock(getTextString(R.string.teory117));
                    ExampleBlock(getTextString(R.string.teory118));
                    break;
                case 1:
                    TextBlockBig(getTextString(R.string.teory20));
                    TextBlockMedium(getTextString(R.string.teory21));
                    TextBlockSmall(getTextString(R.string.teory23));
                    TextBlockSmall(getTextString(R.string.teory24));
                    TextBlockSmall(getTextString(R.string.teory25));
                    AttentionBlock(getTextString(R.string.teory26));
                    break;
                case 2:
                    ImageBlock(R.drawable.teory3);
            }
        }
    }
    static String getTextString(int id){
        return context.getResources().getString(id);
    }

    @SuppressLint("SetTextI18n")
    static void TextBlockSmall(String text){
        View block = inflater.inflate(R.layout.text_block_small, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        layout.addView(block);
    }
    @SuppressLint("SetTextI18n")
    static void TextBlockMedium(String text){
        View block = inflater.inflate(R.layout.text_block_medium, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        layout.addView(block);
    }
    @SuppressLint("SetTextI18n")
    static void TextBlockBig(String text){
        View block = inflater.inflate(R.layout.text_block_big, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        layout.addView(block);
    }
    @SuppressLint("SetTextI18n")
    static void FormuleBlock(String text){
        View block = inflater.inflate(R.layout.formule_block, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        layout.addView(block);
    }

    @SuppressLint("SetTextI18n")
    static void AttentionBlock(String text){
        View block = inflater.inflate(R.layout.attention_block, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        layout.addView(block);
    }

    @SuppressLint("SetTextI18n")
    static void ExampleBlock(String text){
        View block = inflater.inflate(R.layout.example_block, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        tv.setLayoutParams(lp);
        layout.addView(block);
    }

    @SuppressLint("SetTextI18n")
    static void ImageBlock(int id){
        View block = inflater.inflate(R.layout.image_block, null);
        ImageView image = block.findViewById(R.id.image);
        image.setImageResource(id);
        layout.addView(block);
    }
}
