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
import com.github.hardplant.sikgootemplates.data.Event;
import com.github.hardplant.sikgootemplates.ui.EventAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by KANG on 2018-01-12.
 */

public class SearchFragment extends Fragment{
    ArrayList<Event> startList;
    ArrayList<Event> endList;
    RecyclerView startListView;
    RecyclerView endListView;

    LinearLayoutManager startLayoutManager;
    LinearLayoutManager endLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_event, container, false);
        startList = new ArrayList<>();
        endList = new ArrayList<>();

        startLayoutManager = new LinearLayoutManager(getActivity());
        endLayoutManager = new LinearLayoutManager(getActivity());

        startLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        endLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        startListView = rootView.findViewById(R.id.event_start_list);
        endListView = rootView.findViewById(R.id.event_end_list);

        startListView.setLayoutManager(startLayoutManager);
        endListView.setLayoutManager(endLayoutManager);

        EventAdapter startAdapter = new EventAdapter(getActivity(), startList);
        EventAdapter endAdapter = new EventAdapter(getActivity(), endList);

        startListView.setAdapter(startAdapter);
        endListView.setAdapter(endAdapter);

        addTestData();
        return rootView;
    }

    void addTestData(){
        String dates = "2018-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try{Date sample = sdf.parse(dates);
        startList.add(new Event("춘부집 1+1 이벤트", "이벤트", sample,sample)
            .setTestImage());
        startList.add(new Event("춘부집 1+1 이벤트", "이벤트", sample,sample)
                .setTestImage());
        endList.add(new Event("춘부집 1+1 이벤트", "이벤트", sample,sample)
                .setTestImage());
        } catch (Exception e) {}
    }
}
