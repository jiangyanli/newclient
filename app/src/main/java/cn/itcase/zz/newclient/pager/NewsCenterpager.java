package cn.itcase.zz.newclient.pager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import cn.itcase.zz.newclient.utils.NetUtils;


/**
 * Created by user on 2016/5/28.
 */
public class NewsCenterpager extends  BasePager{
    private Context context;

    public NewsCenterpager(Context context) {
        super(context);
        this.context = context;
    }
    @Override
    public View initview() {
        TextView textView =new TextView(context);
        textView.setText("我是新闻中心");
        return textView;
    }
    @Override
    public void initdata() {
       // XUtils.xUtilsPost(ContactURL.LOGIN_URL, map,new Callback.CommonCallback<String>() {
           /*  XUtils.xUtilsGet(NetUtils.NEWS_CENTER_CATEGORIES, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                System.out.print("---------" + result);

                Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {
            }
        });*/

        final RequestParams requestParams = new RequestParams(NetUtils.NEWS_CENTER_CATEGORIES);

        x.http().get(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                System.out.print("---------" + result);

                Toast.makeText(context, result, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }
}
