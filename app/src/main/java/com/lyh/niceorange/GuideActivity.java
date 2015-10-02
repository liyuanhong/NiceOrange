package com.lyh.niceorange;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.lyh.adapter.OrAdapter;

import java.util.ArrayList;


public class GuideActivity extends AppCompatActivity {
    private ViewPager pager = null;
    private View pager1 = null;
    private View pager2 = null;
    private View pager3 = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        pager = (ViewPager) findViewById(R.id.guidePager);
        pager1 = this.getLayoutInflater().inflate(R.layout.guide_pager1,null);
        pager2 = this.getLayoutInflater().inflate(R.layout.guide_pager2,null);
        pager3 = this.getLayoutInflater().inflate(R.layout.guide_pager3,null);

        ArrayList<View> views= new ArrayList<View>();
        views.add(pager1);
        views.add(pager2);
        views.add(pager3);

        OrAdapter adapter = new OrAdapter(views);
        pager.setAdapter(adapter);

    }
}
