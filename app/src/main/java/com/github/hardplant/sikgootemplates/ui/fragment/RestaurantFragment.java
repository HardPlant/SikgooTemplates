package com.github.hardplant.sikgootemplates.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.hardplant.sikgootemplates.R;
import com.github.hardplant.sikgootemplates.data.RestaurantArticle;
import com.github.hardplant.sikgootemplates.data.RestaurantInfo;
import com.github.hardplant.sikgootemplates.data.TodayRestaurant;
import com.github.hardplant.sikgootemplates.ui.EventAdapter;
import com.github.hardplant.sikgootemplates.ui.RestaurantArticleAdapter;
import com.github.hardplant.sikgootemplates.ui.TodayRestaurantAdapter;

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-21.
 */

public class RestaurantFragment extends Fragment {
    private RecyclerView today;
    private RecyclerView colmun;

    private LinearLayoutManager todayLinearLayoutManager;
    private LinearLayoutManager colmunLinearLayoutManager;

    private ArrayList<TodayRestaurant> todayList;
    private ArrayList<RestaurantArticle> articleList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_restaurant_info
                , container, false);
        todayList = new ArrayList<>();
        articleList = new ArrayList<>();

        todayLinearLayoutManager = new LinearLayoutManager(getActivity());
        colmunLinearLayoutManager = new LinearLayoutManager(getActivity());

        todayLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        colmunLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        today = rootView.findViewById(R.id.list_today_rest);
        colmun= rootView.findViewById(R.id.list_today_article);

        today.setLayoutManager(todayLinearLayoutManager);
        colmun.setLayoutManager(colmunLinearLayoutManager);

        TodayRestaurantAdapter startAdapter = new TodayRestaurantAdapter(getActivity(), todayList);
        RestaurantArticleAdapter endAdapter = new RestaurantArticleAdapter(getActivity(), articleList);

        today.setAdapter(startAdapter);
        colmun.setAdapter(endAdapter);

        addTestData();
        return rootView;
    }

    void addTestData(){
        todayList.add(new TodayRestaurant("상대 도스마스").setTestId());
        articleList.add(new RestaurantArticle("상대 도스마스 전남대점"
                ,"간단하게 먹는 한끼식사 도스마스를 해부하다"
                ,"Edited by 선인")
        .setTestId());
    }
}
