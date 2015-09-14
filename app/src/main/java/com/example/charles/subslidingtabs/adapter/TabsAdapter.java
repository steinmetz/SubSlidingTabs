package com.example.charles.subslidingtabs.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.charles.subslidingtabs.bean.MyTabItem;
import java.util.ArrayList;

/**
 * Created by charles on 14/09/15.
 */
public class TabsAdapter
    extends FragmentPagerAdapter {

        private ArrayList<MyTabItem> items;

        public TabsAdapter(FragmentManager fm, ArrayList<MyTabItem> items) {
            super(fm);
            this.items = items;
        }

        @Override
        public Fragment getItem(int position) {
            return items.get(position).getFragment();
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return items.get(position).getTitle();
        }
    }
