package com.github.hardplant.sikgootemplates.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.RestaurantRating;

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-13.
 */

public class RestaurantRatingAdapter extends RecyclerView.Adapter<RestaurantRatingAdapter.ViewHolder>{
    Context context;
    ArrayList<RestaurantRating> infoList;

    public RestaurantRatingAdapter(Context context, ArrayList<RestaurantRating> infoList) {
        this.context = context;
        this.infoList = infoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_restaurant_rating,null);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RestaurantRating restaurantRating = infoList.get(position);

        holder.ratingBar.setNumStars(restaurantRating.getRating());
        holder.dateText.setText(restaurantRating.getDate());
        holder.content.setText(restaurantRating.getContent());

    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RatingBar ratingBar;
        TextView dateText;
        TextView content;

        public ViewHolder(View itemView) {
            super(itemView);

            ratingBar = (RatingBar) itemView.findViewById(R.id.rating);
            dateText = (TextView) itemView.findViewById(R.id.date);
            content = (TextView) itemView.findViewById(R.id.content);
        }
    }
}
