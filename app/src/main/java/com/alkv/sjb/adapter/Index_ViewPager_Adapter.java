package com.alkv.sjb.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


/**
 * Created by alkv1 on 2016/7/15.
 */
public class Index_ViewPager_Adapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    public Index_ViewPager_Adapter(FragmentManager fm ,List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;
    }
    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

}
