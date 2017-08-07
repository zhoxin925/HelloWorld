package com.zhoxin.helloworld.init;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by zhouxin on 2017/8/6.
 */

public class BaseFragment extends Fragment {
    protected Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getActivity()!=null){
            context = getActivity();
        }else{
            context = MyApplication.getAppContext();
        }
        initWidget();
    }

    protected void initWidget() {}
}
