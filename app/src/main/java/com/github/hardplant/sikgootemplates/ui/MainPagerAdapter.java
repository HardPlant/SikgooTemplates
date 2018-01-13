package com.github.hardplant.sikgootemplates.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.github.hardplant.sikgootemplates.ui.fragment.InviteFragment;
import com.github.hardplant.sikgootemplates.ui.fragment.HomeFragment;
import com.github.hardplant.sikgootemplates.ui.fragment.RestaurantFragment;
import com.github.hardplant.sikgootemplates.ui.fragment.SettingsFragment;

/**
 * Created by KANG on 2018-01-12.
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) return new HomeFragment();
        if(position == 1) return new RestaurantFragment();
        if(position == 2) return new InviteFragment();
        return new SettingsFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
