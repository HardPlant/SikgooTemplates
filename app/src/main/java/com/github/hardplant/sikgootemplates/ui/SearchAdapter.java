package com.github.hardplant.sikgootemplates.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.People;
import com.github.hardplant.sikgootemplates.ui.activity.ProfileActivity;

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-12.
 */

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {
    Context context;
    ArrayList<People> peopleList;

    public SearchAdapter(Context context, ArrayList<People> peopleList) {
        this.context = context;
        this.peopleList = peopleList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_people, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        People people = peopleList.get(position);
        final int id = people.getId();
        holder.people_name.setText(people.getName());
        holder.people_hashTag.setText("#Example #Example #Example");
        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(context, ProfileActivity.class);
                bundle.putInt("id", id);
                context.startActivity(intent, bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView thumbnail;
        TextView people_name;
        TextView people_hashTag;
        View.OnClickListener listener;

        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);
//            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
            people_name = (TextView) itemView.findViewById(R.id.people_name);
            people_hashTag = (TextView) itemView.findViewById(R.id.people_hashtag);

            cardview = (CardView) itemView.findViewById(R.id.user_list);
        }

        public void setOnClickListener(View.OnClickListener event){
            listener = event;
            itemView.setOnClickListener(listener);
        }
    }

}
