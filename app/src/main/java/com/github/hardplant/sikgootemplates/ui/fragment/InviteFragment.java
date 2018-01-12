package com.github.hardplant.sikgootemplates.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.People;
import com.github.hardplant.sikgootemplates.ui.PeopleAdapter;
import com.github.hardplant.sikgootemplates.ui.RestaurantAdapter;

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-12.
 */

public class InviteFragment extends Fragment{
    private RecyclerView userView;
    private LinearLayoutManager mLinearLayoutManager;

    private ArrayList<People> peopleList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_user, container, false);
        peopleList = new ArrayList<People>();
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        userView = (RecyclerView)rootView.findViewById(R.id.user_list);
        userView.setHasFixedSize(true);
        userView.setLayoutManager(mLinearLayoutManager);

        peopleList.add(new People(null,"김"
                , new String[]{"#Kim","Park"}));
        peopleList.add(new People(null,"이"
                , new String[]{"#Kim","Park"}));
        peopleList.add(new People(null,"박"
                , new String[]{"#Kim","Park"}));

        PeopleAdapter peopleAdapter = new PeopleAdapter(getActivity(),peopleList);
        userView.setAdapter(peopleAdapter);


        return rootView;
    }
}
