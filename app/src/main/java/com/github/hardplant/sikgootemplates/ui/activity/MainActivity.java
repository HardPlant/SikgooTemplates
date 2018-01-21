package com.github.hardplant.sikgootemplates.ui.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.ui.MainPagerAdapter;
import com.github.hardplant.sikgootemplates.ui.fragment.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        setTab();
        setViewPager();
        addListeners();
    }

    void setToolbar(){
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(mToolbar);
    }

    void setTab(){
        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mTabLayout.addTab(mTabLayout.newTab().setText("홈"));
        mTabLayout.addTab(mTabLayout.newTab().setText("식당"));
        mTabLayout.addTab(mTabLayout.newTab().setText("초대"));
        mTabLayout.addTab(mTabLayout.newTab().setText("이벤트"));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    void setViewPager(){
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
    }
    void addListeners(){
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_setting){
            Intent intent = new Intent(this, appSettingActivity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
