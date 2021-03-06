package com.lyh.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/10/2.
 */
public class OrAdapter extends PagerAdapter {
    private ArrayList<View> views = null;

    public OrAdapter(){

    }

    public OrAdapter(ArrayList<View> views){
        this.views = views;
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(this.views.get(position));
        return this.views.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(this.views.get(position));
    }
}
