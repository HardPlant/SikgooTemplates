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

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-12.
 */

public class RestaurantFragment extends Fragment{
    private RecyclerView restView;
    private GridLayoutManager mGridLayoutManager;

    private ArrayList<RestaurantInfo> restList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main, container, false);

        restList = new ArrayList<RestaurantInfo>();
        mGridLayoutManager = new GridLayoutManager(getActivity(), 2);

        restView = (RecyclerView)rootView.findViewById(R.id.rest_list);
        restView.setHasFixedSize(true);
        restView.setLayoutManager(mGridLayoutManager);

        return rootView;    }
}
