package com.zhoxin.helloworld.coordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import com.zhoxin.helloworld.init.BaseActivity;
import com.zhoxin.helloworld.commonadapter.TablayoutAdapter;
import com.zhoxin.higithub.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouxin on 2017/8/2.
 * coordinator + appbarlayout(toolbar+tablayout)
 */

public class TabLayoutViewActivity extends BaseActivity{
    private Toolbar toolbar;
    private TabLayout tablayout;
    private ViewPager viewPager;

    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinator_tablayout);
        initWidget();
        setSupportActionBar(toolbar);
        /**
         * actionBar.setDisplayHomeAsUpEnabled(true)给左上角图标的左边加上一个返回的图标 。
         * 对应ActionBar.DISPLAY_HOME_AS_UP
         **/
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setData();
        setFragment();
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tablayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
    }

    private void setData() {
        titles.add("新闻");
        titles.add("咨询");
        titles.add("课堂");
        titles.add("资讯");
        titles.add("哈哈哈");
        fragments.add(new TablayoutFragment());
        fragments.add(new TablayoutFragment());
        fragments.add(new TablayoutFragment());
        fragments.add(new TablayoutFragment());
        fragments.add(new TablayoutFragment());
    }

    private void setFragment() {
        viewPager.setAdapter(new TablayoutAdapter(fragments, titles, getSupportFragmentManager()));
        tablayout.setupWithViewPager(viewPager);
        /**
         * tablayoutatapter中没有实现getPageTitle(int p）方法时必须实现以下方法来显示title？？？？？？
         */
//        for(int i=0;i<titles.size();i++) {
//            tablayout.getTabAt(i).setText(titles.get(i));
//        }
    }
}
