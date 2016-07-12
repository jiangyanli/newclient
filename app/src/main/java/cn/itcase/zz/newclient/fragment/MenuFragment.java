package cn.itcase.zz.newclient.fragment;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 2016/5/27.
 */
public class MenuFragment extends BaseFragment {


    @Override
    public View initview() {
        TextView textView = new TextView(getActivity());
        textView.setText("我是菜单界面");
        return textView;
    }

    @Override
    public View initdata() {
        return null;
    }
}
