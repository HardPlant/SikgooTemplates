package com.github.hardplant.sikgootemplates.ui;

import android.content.Context;
import android.media.Rating;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.People;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by KANG on 2018-01-21.
 */

public class PeopleInviteAdapter extends RecyclerView.Adapter<PeopleInviteAdapter.ViewHolder> {
    Context context;
    List<People> peopleList;

    public PeopleInviteAdapter(Context context, List<People> peopleList) {
        this.context = context;
        this.peopleList = peopleList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_people_invite, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        People people = peopleList.get(position);
        holder.name.setText(people.getName());
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView civ;
        TextView name;
        RatingBar ratingBar;
        Button button;
            public ViewHolder(View itemView) {
                super(itemView);
                civ = itemView.findViewById(R.id.thumbnail);
                name = itemView.findViewById(R.id.people_name);
                ratingBar = itemView.findViewById(R.id.rating);
                button = itemView.findViewById(R.id.delete);
            }
    }
}
