package com.example.shopingapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class tabpagerAdapter extends FragmentStatePagerAdapter {
    String[] tabarray=new String[]{"one","two","three","fourth","five","six"};
    public tabpagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int i)
    {

        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
