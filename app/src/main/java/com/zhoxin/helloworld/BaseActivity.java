package com.zhoxin.helloworld;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by zhouxin on 2017/7/30.
 */

public class BaseActivity extends Activity {
    protected Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
    }
}
