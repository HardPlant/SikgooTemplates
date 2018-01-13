package com.github.hardplant.sikgootemplates.ui;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.RestaurantInfo;

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-12.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    Context context;
    ArrayList<RestaurantInfo> restList;

    public RestaurantAdapter(Context context, ArrayList<RestaurantInfo> restList) {
        this.context = context;
        this.restList = restList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_restaurant, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RestaurantInfo restaurantInfo = restList.get(position);

        holder.name.setText(restaurantInfo.getName());
    }

    @Override
    public int getItemCount() {
        return restList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView thumbnail;
        TextView name;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            thumbnail = (ImageView) itemView.findViewById(R.id.restaurant_thumbnail);
            name = (TextView) itemView.findViewById(R.id.restraunt_name);

            cardView = (CardView) itemView.findViewById(R.id.rest_list);
        }
    }
}
