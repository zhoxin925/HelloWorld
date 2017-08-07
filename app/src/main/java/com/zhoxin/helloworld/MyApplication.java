package com.zhoxin.helloworld;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhouxin on 2017/8/6.
 */

public class MyApplication extends Application {
    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }

    public static Context getAppContext() {
        return appContext;
    }
}
