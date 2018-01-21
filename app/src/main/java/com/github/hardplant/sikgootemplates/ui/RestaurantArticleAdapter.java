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
import com.github.hardplant.sikgootemplates.data.RestaurantArticle;

import java.util.List;

/**
 * Created by KANG on 2018-01-21.
 */

public class RestaurantArticleAdapter extends RecyclerView.Adapter<RestaurantArticleAdapter.ViewHolder> {
    Context context;
    List<RestaurantArticle> articleList;

    public RestaurantArticleAdapter(Context context, List<RestaurantArticle> articleList) {
        this.context = context;
        this.articleList = articleList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_today_rest_article, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RestaurantArticle article = articleList.get(position);
        Drawable drawable = ContextCompat.getDrawable(context, article.getId());

        holder.title.setText(article.getName());
        holder.content.setText(article.getContent());
        holder.editor.setText(article.getEditor());
        holder.thumbnail.setBackground(drawable);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView thumbnail;
        TextView title;
        TextView content;
        TextView editor;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.today_rest_thumbnail);
            title = itemView.findViewById(R.id.today_article_name);
            content = itemView.findViewById(R.id.today_content);
            editor = itemView.findViewById(R.id.today_editor);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}
