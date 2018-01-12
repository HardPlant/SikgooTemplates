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
import com.github.hardplant.sikgootemplates.data.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KANG on 2018-01-12.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {
    Context context;
    ArrayList<People> peopleList;

    public PeopleAdapter(Context context, ArrayList<People> peopleList) {
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

        holder.people_name.setText(people.getName());
        holder.people_hashTag.setText("#Example #Example #Example");
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView thumbnail;
        TextView people_name;
        TextView people_hashTag;

        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);
            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
            people_name = (TextView) itemView.findViewById(R.id.people_name);
            people_hashTag = (TextView) itemView.findViewById(R.id.people_hashtag);

            //cardview = (CardView) itemView.findViewById(R.id.);
        }
    }
}
