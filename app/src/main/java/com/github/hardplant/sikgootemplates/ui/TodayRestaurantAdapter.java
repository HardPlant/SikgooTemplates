package com.github.hardplant.sikgootemplates.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.TodayRestaurant;

import java.util.List;

/**
 * Created by KANG on 2018-01-21.
 */

public class TodayRestaurantAdapter extends RecyclerView.Adapter<TodayRestaurantAdapter.ViewHolder> {
    Context context;
    List<TodayRestaurant> restaurantList;

    public TodayRestaurantAdapter(Context context, List<TodayRestaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_today_rest, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TodayRestaurant restaurant = restaurantList.get(position);
        Drawable drawable = ContextCompat.getDrawable(context, restaurant.getId());
        holder.name.setText(restaurant.getContent());
        holder.restImage.setBackground(drawable);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView restImage;
        TextView name;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            restImage = itemView.findViewById(R.id.restaurant_thumbnail);
            name = itemView.findViewById(R.id.restaurant_name);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}
