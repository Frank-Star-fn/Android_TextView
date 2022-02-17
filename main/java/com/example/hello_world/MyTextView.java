package com.example.hello_world;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyTextView extends androidx.appcompat.widget.AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
    }
    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context,attrs);
    }


    public boolean isFocused(){
        return true;
    } // 获取焦点
}
