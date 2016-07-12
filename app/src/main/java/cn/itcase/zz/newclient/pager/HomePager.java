package cn.itcase.zz.newclient.pager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 2016/5/28.
 */
public class HomePager extends  BasePager{
    public HomePager(Context context) {
        super(context);
    }
    @Override
    public View initview() {
        TextView textView =new TextView(context);
        textView.setText("我是内容界面");
        return textView;
    }
    @Override
    public void initdata() {
    }
}
