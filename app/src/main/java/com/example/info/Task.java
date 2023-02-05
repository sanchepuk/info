package com.example.info;

public class Task {
    String txt, result;
    int image;

    public Task(String txt, String result, int image) {
        this.txt = txt;
        this.result = result;
        this.image = image;
    }

    public Task(int txt, int result, int image) {
        this.txt = ControllerInfo.getTextString(txt);
        this.result = ControllerInfo.getTextString(result);
        this.image = image;
    }
    public Task(int txt, int result) {
        this.txt = ControllerInfo.getTextString(txt);
        this.result = ControllerInfo.getTextString(result);
        this.image = -1;
    }

    public String getTxt() {
        return txt;
    }

    public String getResult() {
        return result;
    }

    public int getImage() {
        return image;
    }
}
