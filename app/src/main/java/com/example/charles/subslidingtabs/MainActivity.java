package com.example.charles.subslidingtabs;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.charles.subslidingtabs.adapter.TabsAdapter;
import com.example.charles.subslidingtabs.bean.MyTabItem;
import com.example.charles.subslidingtabs.extra.SlidingTabLayout;
import com.example.charles.subslidingtabs.fragments.Fragment1;
import com.example.charles.subslidingtabs.fragments.Fragment2;

import java.util.ArrayList;


/*
* Extra classes download: https://github.com/google/iosched/tree/master/android/src/main/java/com/google/samples/apps/iosched/ui/widget
* */

public class MainActivity extends AppCompatActivity {

    private SlidingTabLayout slidingTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyTabItem> mainMenuItems = new ArrayList<>();
        mainMenuItems.add(new MyTabItem("MENU 1", Fragment1.class));
        mainMenuItems.add(new MyTabItem("MENU 2", Fragment2.class));

        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.slidingTabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager(), mainMenuItems));
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);



    }

}
