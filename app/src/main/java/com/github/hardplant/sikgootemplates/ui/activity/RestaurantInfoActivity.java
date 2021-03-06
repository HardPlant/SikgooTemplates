package com.github.hardplant.sikgootemplates.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.RestaurantRating;
import com.github.hardplant.sikgootemplates.ui.RestaurantRatingAdapter;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantInfoActivity extends AppCompatActivity {
    private ArrayList<RestaurantRating> infoList;

    private RecyclerView ratingView;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_info);
        setToolbar();
        loadRatings();
        fillRatings();
    }

    private void fillRatings(){
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        ratingView = (RecyclerView)findViewById(R.id.rating_list);
        ratingView.setHasFixedSize(true);
        ratingView.setLayoutManager(linearLayoutManager);

        RestaurantRatingAdapter restaurantRatingAdapter = new RestaurantRatingAdapter(this, infoList);
        ratingView.setAdapter(restaurantRatingAdapter);
    }
    private void loadRatings(){
        infoList = new ArrayList<>();
        infoList.add(new RestaurantRating(5, "Good!", new Date()));
        infoList.add(new RestaurantRating(4, "God!!", new Date()));
        infoList.add(new RestaurantRating(3, "Bad!", new Date()));
        infoList.add(new RestaurantRating(2, "Awful!", new Date()));

    }

    void setToolbar(){
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(mToolbar);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            final Drawable upArrow = getResources().getDrawable(R.drawable.ic_arrow_back_24dp);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}
