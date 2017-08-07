package com.zhoxin.helloworld.commonadapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouxin on 2017/8/6.
 * tablayout 带title设置的adapter
 */

public class TablayoutAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();

    public TablayoutAdapter(List<Fragment> fragments, List<String> titles, FragmentManager fm) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    /**
     * tablayout需要设置setTabsFromPagerAdapter(this)
     * 还有另外一种方法，不需要设置上述代码，
     * 需要设置tabLayout.getTabAt(0).setText("")??????
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
