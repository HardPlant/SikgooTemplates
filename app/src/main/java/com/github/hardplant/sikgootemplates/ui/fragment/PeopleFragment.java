package com.github.hardplant.sikgootemplates.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.People;
import com.github.hardplant.sikgootemplates.data.RestaurantInfo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-12.
 */

public class PeopleFragment extends Fragment {
    private int mPageNumber;

    private RecyclerView userView;
    private RecyclerView restView;
    private LinearLayoutManager mLinearLayoutManager;
    private GridLayoutManager mGridLayoutManager;

    private ArrayList<People> peopleList;
    private ArrayList<RestaurantInfo> restList;

    public static PeopleFragment create(int PageNumber){
        PeopleFragment fragment = new PeopleFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main, container, false);
        peopleList = new ArrayList<People>();
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        userView = (RecyclerView)rootView.findViewById(R.id.user_list);
        userView.setHasFixedSize(true);
        userView.setLayoutManager(mLinearLayoutManager);

        peopleList = new ArrayList<People>();
        mGridLayoutManager = new GridLayoutManager(getActivity(), 2);

        restView = (RecyclerView)rootView.findViewById(R.id.user_list);
        restView.setHasFixedSize(true);
        restView.setLayoutManager(mGridLayoutManager);

        return rootView;
    }
}
