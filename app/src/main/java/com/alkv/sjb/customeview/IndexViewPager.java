package com.alkv.sjb.customeview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by alkv1 on 2016/7/18.
 */
//设置自定义ViewPager
public class IndexViewPager extends ViewPager {

    private boolean isCanScroll = true;

    public IndexViewPager(Context context) {
        super(context);
    }
    public IndexViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScanScroll(boolean isCanScroll){
        this.isCanScroll = isCanScroll;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}
