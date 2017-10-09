package com.sampili.sampilinews;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Parimal_Debbarma on 4/3/2017.
 */

public class Pager extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                OneFragment oneFragment = new OneFragment();
                return oneFragment;
            case 1:
                TwoFragment twoFragment = new TwoFragment();
                return twoFragment;
            case 2:
                ThreeFragment threeFragment = new ThreeFragment();
                return threeFragment;
            case 3:
                FourFragment fourFragment = new FourFragment();
                return fourFragment;
            case 4:
                FiveFragment fiveFragment = new FiveFragment();
                return fiveFragment;
            case 5:
                SixFragment sixFragment = new SixFragment();
                return sixFragment;
            case 6:
                SevenFragment sevenFragment = new SevenFragment();
                return sevenFragment;
            case 7:
                EightFragment eightFragment = new EightFragment();
                return  eightFragment;
            case 8:
            NineFragment nineFragment = new NineFragment();
            return nineFragment;
            case 9:
                TenFragment tenFragment = new TenFragment();
                return tenFragment;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
