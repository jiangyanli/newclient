package cn.itcase.zz.newclient;

import android.os.Bundle;
import android.view.Window;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import cn.itcase.zz.newclient.fragment.HomeFragment;
import cn.itcase.zz.newclient.fragment.MenuFragment;

public class MainActivity extends SlidingFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
//        设置内容。菜单
        setContentView(R.layout.content); //内容界面
        setBehindContentView(R.layout.menu_frame);//菜单界面
//        设置SlidingMenu的属性




        SlidingMenu slidingMenu = getSlidingMenu();
//        分割线
        slidingMenu.setShadowDrawable(R.drawable.shadow);
        slidingMenu.setShadowWidthRes(R.dimen.shadow_width);
        slidingMenu.setMode(SlidingMenu.LEFT);  //打开方式
//        打开方式 全屏
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);//设置全屏
//        菜单的偏移量
        slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
//        替换菜单和内容Fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new HomeFragment()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.menu, new MenuFragment()).commit();

    }
}
