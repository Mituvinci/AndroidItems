package com.androiditems.mitu.androiditems.ViewPager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.androiditems.mitu.androiditems.R;

;
;

public class ViewPagerActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;
    ViewPager vpPager;
    FragmentManager fm;
    Fragment[] pages = new Fragment[]{new FirstFragment(),new SecondFragment()};
    String[] title = {"Cartoon","Nature"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        fm =getSupportFragmentManager();
        vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyAdapter(fm);
        vpPager.setAdapter(adapterViewPager);
    }


    private class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return  pages[position];
        }

        @Override
        public int getCount() {
            return pages.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }
}
