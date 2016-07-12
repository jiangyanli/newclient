package cn.itcase.zz.newclient;

import android.app.Application;

import org.xutils.x;

/**
 * Created by user on 2016/5/28.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
}
