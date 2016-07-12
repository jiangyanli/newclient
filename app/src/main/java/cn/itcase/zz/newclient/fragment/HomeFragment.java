package cn.itcase.zz.newclient.fragment;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import cn.itcase.zz.newclient.R;
import cn.itcase.zz.newclient.pager.BasePager;
import cn.itcase.zz.newclient.pager.GovPager;
import cn.itcase.zz.newclient.pager.HomePager;
import cn.itcase.zz.newclient.pager.NewsCenterpager;
import cn.itcase.zz.newclient.pager.SettingsPager;
import cn.itcase.zz.newclient.pager.SmartServicePager;
import cn.itcase.zz.newclient.view.LazyViewPager;

/**
 * Created by user on 2016/5/27.
 */
public class HomeFragment extends BaseFragment implements RadioGroup.OnCheckedChangeListener {
    private LazyViewPager viewpager;
    private RadioGroup main_radio;

    @Override
    public View initview() {
        View view = View.inflate(getActivity(), R.layout.frag_home, null);
        viewpager = (LazyViewPager) view.findViewById(R.id.viewpager);
        main_radio = (RadioGroup)view.findViewById(R.id.main_radio);
        return view;
    }
private List<BasePager> pagers = new ArrayList<BasePager>();
    @Override
    public View initdata() {
//        准备数据源
        pagers.add(new HomePager(getActivity()));
        pagers.add(new NewsCenterpager(getActivity()));
        pagers.add(new SmartServicePager(getActivity()));
        pagers.add(new GovPager(getActivity()));
        pagers.add(new SettingsPager(getActivity()));

        viewpager.setAdapter(new MyAdapter());
        main_radio.check(R.id.rb_function);
        main_radio.setOnCheckedChangeListener(this);
        return null;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int item = 0;
        switch (checkedId){
            case R.id.rb_function:
                item = 0;
                break;
            case R.id.rb_news_center:
                item = 1;
                break;
            case R.id.rb_smart_service:
                item = 2;
                break;
            case R.id.rb_gov_affairs:
                item = 3;
                break;
            case R.id.rb_setting:
                item = 4;
                break;
        }

        viewpager.setCurrentItem(item);
    }


    private class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return pagers.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            System.out.println("instantiateItem"+position);

            BasePager currentPager =  pagers.get(position);
            View currentPagerView = currentPager.initview();
            container.addView(currentPagerView);
            currentPager.initdata();
            return currentPagerView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            System.out.println("destroyItem"+ position);
           container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }
}
