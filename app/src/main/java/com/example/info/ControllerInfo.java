package com.example.info;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ControllerInfo {
    static LayoutInflater inflater;
    static Context context;
    static LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    static LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    static LinearLayout layout;
    static void init(LayoutInflater inf, int block, int i, LinearLayout lay, Context c){
        lp.weight = 1;
        lp1.weight = 1;
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
                    break;
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
                    break;
                case 5:
                    TextBlockBig(getTextString(R.string.teory60));
                    TextBlockMedium(getTextString(R.string.teory61));
                    TextBlockSmall(getTextString(R.string.teory62));
                    ExampleBlock(getTextString(R.string.teory63));
                    AttentionBlock(getTextString(R.string.teory64));
                    TextBlockSmall(getTextString(R.string.teory65));
                    ImageBlock(R.drawable.teory6);
                    TextBlockSmall(getTextString(R.string.teory66));
                    ExampleBlock(getTextString(R.string.teory67));
                    TextBlockMedium(getTextString(R.string.teory68));
                    ImageBlock(R.drawable.teory60);
                    TextBlockMedium(getTextString(R.string.teory69));
                    TextBlockSmall(getTextString(R.string.teory610));
                    ImageBlock(R.drawable.teory61);
                    TextBlockBig(getTextString(R.string.teory611));
                    TextBlockMedium(getTextString(R.string.teory612));
                    TextBlockSmall(getTextString(R.string.teory613));
                    TextBlockMedium(getTextString(R.string.teory614));
                    ImageBlock(R.drawable.teory63);
                    AttentionBlock(getTextString(R.string.teory615));
                    TextBlockBig(getTextString(R.string.teory616));
                    TextBlockMedium(getTextString(R.string.teory617));
                    TextBlockSmall(getTextString(R.string.teory618));
                    TextBlockSmall(getTextString(R.string.teory619));
                    ImageBlock(R.drawable.teory62);
                    break;
                case 6:
                    TextBlockBig(getTextString(R.string.teory70));
                    TextBlockMedium(getTextString(R.string.teory71));
                    TextBlockMedium(getTextString(R.string.teory72));
                    TextBlockSmall(getTextString(R.string.teory73));
                    TextBlockMedium(getTextString(R.string.teory74));
                    TextBlockSmall(getTextString(R.string.teory75));
                    TextBlockMedium(getTextString(R.string.teory76));
                    ImageBlock(R.drawable.teory7);
                    TextBlockSmall(getTextString(R.string.teory77));
                    break;
                case 7:
                    TextBlockBig(getTextString(R.string.teory80));
                    TextBlockMedium(getTextString(R.string.teory81));
                    TextBlockSmall(getTextString(R.string.teory82));
                    AttentionBlock(getTextString(R.string.teory83));
                    TextBlockMedium(getTextString(R.string.teory84));
                    TextBlockSmall(getTextString(R.string.teory85));
                    AttentionBlock(getTextString(R.string.teory86));
                    TextBlockBig(getTextString(R.string.teory87));
                    ImageBlock(R.drawable.teory80);
                    TextBlockSmall(getTextString(R.string.teory88));
                    TextBlockMedium(getTextString(R.string.teory89));
                    ImageBlock(R.drawable.teory81);
                    TextBlockSmall(getTextString(R.string.teory810));
                    TextBlockMedium(getTextString(R.string.teory811));
                    ImageBlock(R.drawable.teory82);
                    TextBlockBig(getTextString(R.string.teory812));
                    FormuleBlock(getTextString(R.string.teory813));
                    FormuleBlock(getTextString(R.string.teory814));
                    break;
                case 8:
                    TextBlockBig(getTextString(R.string.teory90));
                    TextBlockSmall(getTextString(R.string.teory91));
                    FormuleBlock(getTextString(R.string.teory92));
                    TextBlockSmall(getTextString(R.string.teory93));
                    TextBlockMedium(getTextString(R.string.teory94));
                    break;
                case 9:
                    TextBlockBig(getTextString(R.string.teory100));
                    TextBlockMedium(getTextString(R.string.teory101));
                    ImageBlock(R.drawable.teory100);
                    TextBlockMedium(getTextString(R.string.teory102));
                    ImageBlock(R.drawable.teory101);
                    TextBlockBig(getTextString(R.string.teory103));
                    TextBlockMedium(getTextString(R.string.teory104));
                    ImageBlock(R.drawable.teory102);
                    TextBlockMedium(getTextString(R.string.teory105));
                    ImageBlock(R.drawable.teory103);
                    TextBlockMedium(getTextString(R.string.teory106));
                    ImageBlock(R.drawable.teory105);
                    ImageBlock(R.drawable.teory104);
            }
        }else{
            switch (i){
                case 0:
                    TaskBlock(1, getTextString(R.string.task10), getTextString(R.string.res10));
                    TaskBlock(2, getTextString(R.string.task11), getTextString(R.string.res11));
                    break;
                case 1:
                    TaskBlock(1, getTextString(R.string.task20), R.drawable.task20, getTextString(R.string.res20));
                    TaskBlock(2, getTextString(R.string.task21), R.drawable.task21, getTextString(R.string.res21));
                    break;
                case 2:
                    TaskBlock(1, getTextString(R.string.task30), R.drawable.task30, getTextString(R.string.res30));
                    TaskBlock(2, getTextString(R.string.task31), R.drawable.task31, getTextString(R.string.res31));
                    break;
                case 3:
                    TaskBlock(1, getTextString(R.string.task40), R.drawable.task40, getTextString(R.string.res40));
                    TaskBlock(2, getTextString(R.string.task41), R.drawable.task41, getTextString(R.string.res41));
                    break;
                case 4:
                    TaskBlock(1, getTextString(R.string.task50), getTextString(R.string.res50));
                    TaskBlock(2, getTextString(R.string.task51), getTextString(R.string.res51));
                    break;
                case 5:
                    TaskBlock(1, getTextString(R.string.task60), R.drawable.task60, getTextString(R.string.res60));
                    TaskBlock(2, getTextString(R.string.task61), R.drawable.task61, getTextString(R.string.res61));
                    break;
                case 6:
                    TaskBlock(1, getTextString(R.string.task70), getTextString(R.string.res70));
                    TaskBlock(2, getTextString(R.string.task71), getTextString(R.string.res71));
                    break;
                case 7:
                    TaskBlock(1, getTextString(R.string.task80), R.drawable.task80, getTextString(R.string.res80));
                    TaskBlock(2, getTextString(R.string.task81), R.drawable.task81, getTextString(R.string.res81));
                    break;
                case 8:
                    TaskBlock(1, getTextString(R.string.task90), R.drawable.task90, getTextString(R.string.res90));
                    TaskBlock(2, getTextString(R.string.task91), R.drawable.task91, getTextString(R.string.res91));
                    break;
                case 9:
                    TaskBlock(1, getTextString(R.string.task100), R.drawable.task100, getTextString(R.string.res100));
                    TaskBlock(2, getTextString(R.string.task101), R.drawable.task101, getTextString(R.string.res101));
                    break;
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
        layout.addView(block);
    }
    @SuppressLint("SetTextI18n")
    static void TextBlockBig(String text){
        View block = inflater.inflate(R.layout.text_block_big, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        layout.addView(block);
    }
    @SuppressLint("SetTextI18n")
    static void FormuleBlock(String text){
        View block = inflater.inflate(R.layout.formule_block, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        layout.addView(block);
    }

    @SuppressLint("SetTextI18n")
    static void AttentionBlock(String text){
        View block = inflater.inflate(R.layout.attention_block, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        layout.addView(block);
    }

    @SuppressLint("SetTextI18n")
    static void ExampleBlock(String text){
        View block = inflater.inflate(R.layout.example_block, null);
        TextView tv = block.findViewById(R.id.text);
        tv.setText(text);
        layout.addView(block);
    }

    @SuppressLint("SetTextI18n")
    static void ImageBlock(int id){
        View block = inflater.inflate(R.layout.image_block, null);
        ImageView image = block.findViewById(R.id.image);
        image.setImageResource(id);
        layout.addView(block);
    }

    @SuppressLint("SetTextI18n")
    static void TaskBlock(int num, String task, String result){
        View block = inflater.inflate(R.layout.task_block, null);
        TextView tvnum = block.findViewById(R.id.num);
        tvnum.setText(Integer.toString(num));
        TextView tv = block.findViewById(R.id.text);
        tv.setText(task);
        TextView rtv = block.findViewById(R.id.res);
        Button btn = block.findViewById(R.id.button);
        btn.setTag("0");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getTag() == "0"){
                    rtv.setLayoutParams(lp);
                    btn.setText("Скрыть ответ");
                    rtv.setText(result);
                    rtv.setBackground(null);
                    view.setTag("1");
                }else{
                    rtv.setLayoutParams(lp1);
                    btn.setText("Узнать ответ");
                    rtv.setText("");
                    rtv.setBackgroundResource(R.drawable.background);
                    view.setTag("0");
                }


            }
        });
        ImageView image = block.findViewById(R.id.image);
        image.setVisibility(View.GONE);
        layout.addView(block);
    }

    @SuppressLint("SetTextI18n")
    static void TaskBlock(int num, String task, int idImage, String result){
        View block = inflater.inflate(R.layout.task_block, null);
        TextView tvnum = block.findViewById(R.id.num);
        tvnum.setText(Integer.toString(num));
        TextView tv = block.findViewById(R.id.text);
        tv.setText(task);
        TextView rtv = block.findViewById(R.id.res);
        TextView btn = block.findViewById(R.id.button);
        btn.setTag("0");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getTag() == "0"){
                    rtv.setLayoutParams(lp);
                    btn.setText("Скрыть ответ");
                    rtv.setText(result);
                    rtv.setBackground(null);
                    view.setTag("1");
                }else{
                    rtv.setLayoutParams(lp1);
                    btn.setText("Узнать ответ");
                    rtv.setText("");
                    rtv.setBackgroundResource(R.drawable.background);
                    view.setTag("0");
                }


            }
        });
        ImageView image = block.findViewById(R.id.image);
        image.setImageResource(idImage);
        layout.addView(block);
    }
}
