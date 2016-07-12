package cn.itcase.zz.newclient.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyViewPager extends LazyViewPager {

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewPager(Context context) {
        super(context);
    }
    /**
     * Viewpager实现左右滑动
     * 1. 消费事件  onTouchEvent  true
     * 2. 中断事件  onInterceptTouchEvent   true
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
    
    
    
}
