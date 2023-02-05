package com.example.info;

import android.content.Context;

public class Task {
    String txt, result;
    int image;
    public Task(int txt, int result, int image, Context context) {
        this.txt = getTextString(txt, context);
        this.result = getTextString(result, context);
        this.image = image;
    }
    public Task(int txt, int result, Context context) {
        this.txt = getTextString(txt, context);
        this.result = getTextString(result, context);
        this.image = -1;
    }
    public String getTextString(int id, Context context){
        return context.getResources().getString(id);
    }

}
