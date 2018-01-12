package com.github.hardplant.sikgootemplates.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.github.hardplant.sikgootemplates.ui.fragment.InviteFragment;
import com.github.hardplant.sikgootemplates.ui.fragment.PeopleFragment;
import com.github.hardplant.sikgootemplates.ui.fragment.RestaurantFragment;

/**
 * Created by KANG on 2018-01-12.
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) return new PeopleFragment();
        if(position == 1) return new RestaurantFragment();
        if(position == 2) return new InviteFragment();
        return new PeopleFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
