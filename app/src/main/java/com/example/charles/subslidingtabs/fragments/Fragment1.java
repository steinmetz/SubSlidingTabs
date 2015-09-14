package com.example.charles.subslidingtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.charles.subslidingtabs.R;
import com.example.charles.subslidingtabs.adapter.TabsAdapter;
import com.example.charles.subslidingtabs.bean.MyTabItem;
import com.example.charles.subslidingtabs.extra.SlidingTabLayout;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    private SlidingTabLayout slidingTabLayout;
    private ViewPager viewPager;
    private ArrayList<MyTabItem> items;

    public Fragment1() {
        items = new ArrayList<>();
        items.add(new MyTabItem("SUB MENU 1A", Fragment1A.class));
        items.add(new MyTabItem("SUB MENU 1B", Fragment1B.class));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        slidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.f1slidingTabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.f1viewPager);

        viewPager.setAdapter(new TabsAdapter(getChildFragmentManager(), items));
        slidingTabLayout.setViewPager(viewPager);

        return view;
    }


}
