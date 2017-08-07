package com.zhoxin.helloworld;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zhouxin on 2017/7/30.
 */

public class BaseActivity extends AppCompatActivity {
    protected Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        initWidget();
    }

    protected void initWidget() {}
}
