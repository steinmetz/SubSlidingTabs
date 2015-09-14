package com.example.charles.subslidingtabs.bean;

import android.support.v4.app.Fragment;

/**
 * Created by charles on 14/09/15.
 */
public class MyTabItem {
    private String title;
    private Class fragmentClass;

    public MyTabItem(String title, Class fragmentClass) {
        this.title = title;
        this.fragmentClass = fragmentClass;
    }

    public Fragment getFragment(){
        try {
            return (Fragment) fragmentClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class getFragmentClass() {
        return fragmentClass;
    }

    public void setFragmentClass(Class fragmentClass) {
        this.fragmentClass = fragmentClass;
    }

}
