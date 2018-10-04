package com.example.dudgn.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    int MAX = 2;

    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    Fragment fragment = new Fragment();

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) { //뷰페이저 할 때 스와이프하는데 그때 아이템 얻는 메소em
        if(position < 0|| MAX <= position) return null;
        switch (position){
            case 0:
                fragment = firstFragment;
                break;
            case 1:
                fragment = secondFragment;
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return MAX;
    }
}
