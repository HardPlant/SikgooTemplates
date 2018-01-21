package com.github.hardplant.sikgootemplates.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.github.hardplant.sikgootemplates.data.ChatMessage;

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-21.
 */

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    Context context;
    ArrayList<ChatMessage> messageList;

    public ChatAdapter(Context context, ArrayList<ChatMessage> messageList) {
        this.context = context;
        this.messageList = messageList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
