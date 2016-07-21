package com.alkv.sjb.actions;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alkv.sjb.adapter.Index_ViewPager_Adapter;
import com.alkv.sjb.fragment.FindFragment;
import com.alkv.sjb.fragment.IndexFragment;
import com.alkv.sjb.fragment.MyInfoFragment;
import com.alkv.sjb.fragment.PicsFragment;
import com.alkv.sjb.fragment.QuestionFragment;
import com.alkv.sjb.customeview.IndexViewPager;
import com.alkv.sjb.sjb_version25.R;

import java.util.ArrayList;
import java.util.List;

/**
 * app首页面、案例页面：
 *      首页轮播、中部推荐、下拉展示
 */
public class IndexActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {
    private List<Fragment> fragmentList;
    private IndexViewPager viewPager;
    private RadioGroup radioGroup;
    private RadioButton bottom_radio_btn01, bottom_radio_btn02, bottom_radio_btn03, bottom_radio_btn04, bottom_radio_btn05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        //初始化首页viewpager中的fragment
        initFragment();
        //初始化控件
        initViews();

    }

    //初始化Bottom的RadioButton显示状态
    private void initRadioButton() {
        bottom_radio_btn01.setEnabled(true);
        bottom_radio_btn01.setTextColor(Color.parseColor("#666666"));
        bottom_radio_btn02.setEnabled(true);
        bottom_radio_btn02.setTextColor(Color.parseColor("#666666"));
        bottom_radio_btn03.setEnabled(true);
        bottom_radio_btn03.setTextColor(Color.parseColor("#666666"));
        bottom_radio_btn04.setEnabled(true);
        bottom_radio_btn04.setTextColor(Color.parseColor("#666666"));
        bottom_radio_btn05.setEnabled(true);
        bottom_radio_btn05.setTextColor(Color.parseColor("#666666"));
    }

    //初始化控件
    private void initViews() {
        radioGroup = (RadioGroup) this.findViewById(R.id.bottom_radio_group);
        bottom_radio_btn01 = (RadioButton) this.findViewById(R.id.bottom_radio_btn01);
        bottom_radio_btn02 = (RadioButton) this.findViewById(R.id.bottom_radio_btn02);
        bottom_radio_btn03 = (RadioButton) this.findViewById(R.id.bottom_radio_btn03);
        bottom_radio_btn04 = (RadioButton) this.findViewById(R.id.bottom_radio_btn04);
        bottom_radio_btn05 = (RadioButton) this.findViewById(R.id.bottom_radio_btn05);
        bottom_radio_btn01.setEnabled(false);
        bottom_radio_btn01.setTextColor(Color.RED);
        //给底部radiogroup设置监听
        radioGroup.setOnCheckedChangeListener(this);
        //给viewPager设置adapter
        viewPager = (IndexViewPager) IndexActivity.this.findViewById(R.id.index_viewpager);
        Index_ViewPager_Adapter index_viewPager_adapter = new Index_ViewPager_Adapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(index_viewPager_adapter);
    }

    //初始化首页viewpager中的fragment
    private void initFragment() {
        fragmentList = new ArrayList<>();
        IndexFragment indexFragment = new IndexFragment();
        PicsFragment picsFragment = new PicsFragment();
        QuestionFragment questionFragment = new QuestionFragment();
        FindFragment findFragment = new FindFragment();
        MyInfoFragment myInfoFragment = new MyInfoFragment();
        fragmentList.add(indexFragment);
        fragmentList.add(picsFragment);
        fragmentList.add(questionFragment);
        fragmentList.add(findFragment);
        fragmentList.add(myInfoFragment);
    }

    //底部radioGroup的监听
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case R.id.bottom_radio_btn01:
                viewPager.setCurrentItem(0,false);
                initRadioButton();
                bottom_radio_btn01.setEnabled(false);
                bottom_radio_btn01.setTextColor(Color.RED);
                break;
            case R.id.bottom_radio_btn02:
                viewPager.setCurrentItem(1,false);
                initRadioButton();
                bottom_radio_btn02.setEnabled(false);
                bottom_radio_btn02.setTextColor(Color.RED);
                break;
            case R.id.bottom_radio_btn03:
                viewPager.setCurrentItem(2,false);
                initRadioButton();
                bottom_radio_btn03.setEnabled(false);
                bottom_radio_btn03.setTextColor(Color.RED);
                break;
            case R.id.bottom_radio_btn04:
                viewPager.setCurrentItem(3,false);
                initRadioButton();
                bottom_radio_btn04.setEnabled(false);
                bottom_radio_btn04.setTextColor(Color.RED);
                break;
            case R.id.bottom_radio_btn05:
                viewPager.setCurrentItem(4,false);
                initRadioButton();
                bottom_radio_btn05.setEnabled(false);
                bottom_radio_btn05.setTextColor(Color.RED);
                break;
        }
    }

}

