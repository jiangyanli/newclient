package cn.itcase.zz.newclient.pager;

import android.content.Context;
import android.view.View;

/**
 * Created by user on 2016/5/28.
 */
public abstract class BasePager {
    public Context context;
    public BasePager(Context context) {
        this.context = context;
    }

    /**
     * 初始化页面
     * @return
     */
    public  abstract View initview();

    /**
     * 初始化数据
     * @return
     */
    public abstract void initdata();
}
