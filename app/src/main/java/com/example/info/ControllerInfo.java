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
                    TextBlockSmall(getTextString(R.string.teory30));
                    TextBlockMedium(getTextString(R.string.teory31));
                    ImageBlock(R.drawable.teory3);
                    TextBlockMedium(getTextString(R.string.teory32));
                    TextBlockSmall(getTextString(R.string.teory33));
                    TextBlockSmall(getTextString(R.string.teory36));
                    ImageBlock(R.drawable.teory30);
                    AttentionBlock(getTextString(R.string.teory34));
                    TextBlockSmall(getTextString(R.string.teory37));
                    ImageBlock(R.drawable.teory31);
                    AttentionBlock(getTextString(R.string.teory35));
                    TextBlockSmall(getTextString(R.string.teory38));
                    ImageBlock(R.drawable.teory32);
                    TextBlockSmall(getTextString(R.string.teory39));
                    ImageBlock(R.drawable.teory33);
                    TextBlockMedium(getTextString(R.string.teory310));
                    TextBlockSmall(getTextString(R.string.teory311));
                    ImageBlock(R.drawable.teory34);
                case 3:
                    TextBlockBig(getTextString(R.string.teory40));
                    TextBlockSmall(getTextString(R.string.teory41));
                    TextBlockMedium(getTextString(R.string.teory42));
                    TextBlockSmall(getTextString(R.string.teory43));
                    ImageBlock(R.drawable.teory4);
                    TextBlockBig(getTextString(R.string.teory44));
                    ImageBlock(R.drawable.teory40);
                    TextBlockMedium(getTextString(R.string.teory45));
                    TextBlockSmall(getTextString(R.string.teory46));
                    ImageBlock(R.drawable.teory41);
                    TextBlockMedium(getTextString(R.string.teory47));
                    TextBlockSmall(getTextString(R.string.teory48));
                    ImageBlock(R.drawable.teory42);
                    TextBlockBig(getTextString(R.string.teory49));
                    TextBlockSmall(getTextString(R.string.teory410));
                    ImageBlock(R.drawable.teory43);
                    TextBlockSmall(getTextString(R.string.teory411));
                    ImageBlock(R.drawable.teory44);
                    TextBlockBig(getTextString(R.string.teory412));
                    TextBlockSmall(getTextString(R.string.teory413));
                    ImageBlock(R.drawable.teory45);
                    AttentionBlock(getTextString(R.string.teory414));
                    AttentionBlock(getTextString(R.string.teory415));
                    AttentionBlock(getTextString(R.string.teory416));
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
