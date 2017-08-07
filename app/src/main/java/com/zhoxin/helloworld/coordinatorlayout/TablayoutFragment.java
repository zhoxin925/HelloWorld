package com.zhoxin.helloworld.coordinatorlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhoxin.helloworld.BaseFragment;
import com.zhoxin.higithub.R;

/**
 * Created by zhouxin on 2017/8/6.
 * tablayout 此处可滑动的view  不能是scrollview、listview或gridview
 */

public class TablayoutFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.coordinator_tablayout_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
