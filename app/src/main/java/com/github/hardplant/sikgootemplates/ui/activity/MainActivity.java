package com.github.hardplant.sikgootemplates.ui.activity;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.ui.MainPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void setToolbar(){
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(mToolbar);
    }

    void setViewPager(){
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);

    }
}
