package cn.itcase.zz.newclient.pager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 2016/5/28.
 */
public class SettingsPager extends  BasePager{
    public SettingsPager(Context context) {
        super(context);
    }
    @Override
    public View initview() {
        TextView textView =new TextView(context);
        textView.setText("我是设置界面");
        return textView;
    }
    @Override
    public void initdata() {
    }
}
