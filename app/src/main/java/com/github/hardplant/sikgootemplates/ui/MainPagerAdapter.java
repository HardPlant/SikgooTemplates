package com.github.hardplant.sikgootemplates.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.github.hardplant.sikgootemplates.ui.fragment.PeopleFragment;

/**
 * Created by KANG on 2018-01-12.
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new PeopleFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
