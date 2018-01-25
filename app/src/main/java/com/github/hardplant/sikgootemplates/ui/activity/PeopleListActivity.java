package com.github.hardplant.sikgootemplates.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.People;
import com.github.hardplant.sikgootemplates.ui.PeopleInviteAdapter;

import java.util.ArrayList;

public class PeopleListActivity extends AppCompatActivity {
    private RecyclerView rv;
    private LinearLayoutManager linearLayoutManager;

    private ArrayList<People> peopleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_list);
        setPeopleList();
    }

    void setPeopleList(){
        peopleList = new ArrayList<>();
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv = (RecyclerView) findViewById(R.id.user_list);
        rv.setLayoutManager(linearLayoutManager);

        PeopleInviteAdapter peopleAdapter = new PeopleInviteAdapter(this,peopleList);
        rv.setAdapter(peopleAdapter);

    }
}
