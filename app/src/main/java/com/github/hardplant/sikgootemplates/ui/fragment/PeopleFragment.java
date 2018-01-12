package com.github.hardplant.sikgootemplates.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.hardplant.sikgootemplates.R;

/**
 * Created by KANG on 2018-01-12.
 */

public class PeopleFragment extends Fragment {
    private int mPageNumber;

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

        return rootView;
    }
}
