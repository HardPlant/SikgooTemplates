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
import com.github.hardplant.sikgootemplates.data.RestaurantInfo;
import com.github.hardplant.sikgootemplates.ui.RestaurantAdapter;

import java.util.ArrayList;

/**
 * Created by KANG on 2018-01-12.
 */

public class RestaurantSelectFragment extends Fragment{
    private RecyclerView restViewToday;
    private RecyclerView restViewSangdae;
    private RecyclerView restViewFront;
    private RecyclerView restViewRear;
    private RecyclerView restViewYaedae;

    private LinearLayoutManager linearLayoutManagerFront;
    private LinearLayoutManager linearLayoutManagerRear;
    private LinearLayoutManager linearLayoutManagerYaedae;
    private LinearLayoutManager linearLayoutManagerSangdae;
    private LinearLayoutManager linearLayoutManagerVertical;

    private ArrayList<RestaurantInfo> restListToday;
    private ArrayList<RestaurantInfo> restListSangdae;
    private ArrayList<RestaurantInfo> restListFront;
    private ArrayList<RestaurantInfo> restListRear;
    private ArrayList<RestaurantInfo> restListYaedae;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_restaruant_select, container, false);

        addtestData();

        //mGridLayoutManager = new GridLayoutManager(getActivity(), 2);
        linearLayoutManagerVertical = new LinearLayoutManager(getActivity()
                , LinearLayoutManager.VERTICAL, false);
        linearLayoutManagerFront = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManagerYaedae = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManagerSangdae = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManagerYaedae = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        restViewToday = (RecyclerView)rootView.findViewById(R.id.today_rest);
        restViewToday.setHasFixedSize(true);
        restViewToday.setLayoutManager(linearLayoutManagerVertical);


        restViewFront = (RecyclerView)rootView.findViewById(R.id.rest_front);
        restViewFront.setHasFixedSize(true);
        restViewFront.setLayoutManager(linearLayoutManagerFront);


        restViewRear = (RecyclerView)rootView.findViewById(R.id.rest_rear);
        restViewRear.setHasFixedSize(true);
        restViewRear.setLayoutManager(linearLayoutManagerRear);


        restViewSangdae = (RecyclerView)rootView.findViewById(R.id.rest_sangdae);
        restViewSangdae.setHasFixedSize(true);
        restViewSangdae.setLayoutManager(linearLayoutManagerSangdae);


        restViewYaedae = (RecyclerView)rootView.findViewById(R.id.rest_yaedae);
        restViewYaedae.setHasFixedSize(true);
        restViewYaedae.setLayoutManager(linearLayoutManagerYaedae);


        RestaurantAdapter todayAdapter = new RestaurantAdapter(getActivity()
                ,restListToday);
        restViewToday.setAdapter(todayAdapter);

        RestaurantAdapter frontAdapter = new RestaurantAdapter(getActivity()
                ,restListFront);
        restViewFront.setAdapter(frontAdapter);

        RestaurantAdapter rearAdapter = new RestaurantAdapter(getActivity()
                ,restListRear);
        restViewRear.setAdapter(rearAdapter);

        RestaurantAdapter sangdaeAdapter = new RestaurantAdapter(getActivity()
                ,restListSangdae);
        restViewSangdae.setAdapter(sangdaeAdapter);

        RestaurantAdapter yaedaeAdapter = new RestaurantAdapter(getActivity()
                ,restListYaedae);
        restViewYaedae.setAdapter(yaedaeAdapter);

        return rootView;
    }
    private void addtestData(){
        ArrayList<RestaurantInfo> testData = new ArrayList<RestaurantInfo>();
        testData.add(new RestaurantInfo("Hi"));
        testData.add(new RestaurantInfo("Hi"));
        testData.add(new RestaurantInfo("Hi"));

        restListToday = new ArrayList<>();
        restListFront = new ArrayList<>();
        restListRear = new ArrayList<>();
        restListYaedae = new ArrayList<>();
        restListSangdae = new ArrayList<>();

        restListToday.addAll(testData);

        restListFront.addAll(testData);
        restListRear.addAll(testData);
        restListYaedae.addAll(testData);
        restListSangdae.addAll(testData);
    }
}
