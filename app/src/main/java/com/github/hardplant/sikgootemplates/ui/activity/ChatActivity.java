package com.github.hardplant.sikgootemplates.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.ChatMessage;
import com.github.hardplant.sikgootemplates.data.People;
import com.github.hardplant.sikgootemplates.ui.ChatAdapter;
import com.github.hardplant.sikgootemplates.ui.PeopleAdapter;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {
    ArrayList<ChatMessage> messageList;
    LinearLayoutManager mLinearLayoutManager;
    RecyclerView chatView;
    Button sendButton;
    EditText sendMesage;
    ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setToolbar();
        setChatView();

        Button sendButton = findViewById(R.id.send);
        final EditText messageBox = findViewById(R.id.chat_box);

        final People example = new People("", "Kim", new String[]{""});

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = messageBox.getText().toString();
                ChatMessage chatMessage = new ChatMessage(example, message);
                messageList.add(chatMessage);
                messageBox.setText("");
                chatAdapter.notifyDataSetChanged();
            }
        });
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
    void setChatView(){
        messageList = new ArrayList<ChatMessage>();
        mLinearLayoutManager = new LinearLayoutManager(ChatActivity.this);
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        chatView = findViewById(R.id.chat_view);
        chatView.setHasFixedSize(true);
        chatView.setLayoutManager(mLinearLayoutManager);

        chatAdapter = new ChatAdapter(ChatActivity.this, messageList);
        chatView.setAdapter(chatAdapter);

    }
}
