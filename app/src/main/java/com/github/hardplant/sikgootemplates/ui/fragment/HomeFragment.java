package com.github.hardplant.sikgootemplates.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.People;
import com.github.hardplant.sikgootemplates.data.RestaurantInfo;
import com.github.hardplant.sikgootemplates.ui.PeopleAdapter;
import com.github.hardplant.sikgootemplates.ui.RestaurantAdapter;
import com.github.hardplant.sikgootemplates.ui.activity.MatchingActivity;

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-12.
 */

public class HomeFragment extends Fragment {

    private Button matchButton;

    private RecyclerView userView;
    private RecyclerView restView;
    private LinearLayoutManager mLinearLayoutManager;
    private GridLayoutManager mGridLayoutManager;


    private ArrayList<People> peopleList;
    private ArrayList<RestaurantInfo> restList;

    public static HomeFragment create(int PageNumber){
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_home, container, false);
        peopleList = new ArrayList<People>();
        peopleList.add(new People(null,"김"
                , new String[]{"#Kim","Park"}));
        peopleList.add(new People(null,"이"
                , new String[]{"#Kim","Park"}));
        peopleList.add(new People(null,"박"
                , new String[]{"#Kim","Park"}));
        peopleList.add(new People(null,"박"
                , new String[]{"#Kim","Park"}));
        peopleList.add(new People(null,"박"
                , new String[]{"#Kim","Park"}));
        peopleList.add(new People(null,"박"
                , new String[]{"#Kim","Park"}));
        peopleList.add(new People(null,"박"
                , new String[]{"#Kim","Park"}));

        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        userView = (RecyclerView)rootView.findViewById(R.id.user_list);
        userView.setHasFixedSize(true);
        userView.setLayoutManager(mLinearLayoutManager);
        restList = new ArrayList<RestaurantInfo>();
        restList.add(new RestaurantInfo("한식",R.drawable.food1));
        restList.add(new RestaurantInfo("중식",R.drawable.food2));
        restList.add(new RestaurantInfo("일식",R.drawable.food3));
        restList.add(new RestaurantInfo("양식",R.drawable.food4));
        restList.add(new RestaurantInfo("불식",R.drawable.food5));
        restList.add(new RestaurantInfo("사용식",R.drawable.food6));


        mGridLayoutManager = new GridLayoutManager(getActivity(), 3);
        restView = (RecyclerView)rootView.findViewById(R.id.rest_list);
        restView.setHasFixedSize(true);
        restView.setLayoutManager(mGridLayoutManager);

        PeopleAdapter peopleAdapter = new PeopleAdapter(getActivity(),peopleList);
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(),restList);
        userView.setAdapter(peopleAdapter);
        restView.setAdapter(restaurantAdapter);

        matchButton = (Button) rootView.findViewById(R.id.match_button);
        matchButton.setOnClickListener(getMatchButtonListener());

        return rootView;
    }

    View.OnClickListener getMatchButtonListener(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MatchingActivity.class);
                getContext().startActivity(intent);
            }
        };
    }
}
