package com.lyh.niceorange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.lyh.adapter.OrAdapter;

import java.util.ArrayList;


public class GuideActivity extends AppCompatActivity implements View.OnClickListener{
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
        pager3 = this.getLayoutInflater().inflate(R.layout.guide_pager3, null);
        ImageView pageTitle1 = (ImageView) pager1.findViewById(R.id.guide_pager1);
        pageTitle1.setImageResource(R.mipmap.guide_page1);
        ImageView pageTitle2 = (ImageView) pager2.findViewById(R.id.guide_pager2);
        pageTitle2.setImageResource(R.mipmap.guide_page2);
        ImageView pageTitle3 = (ImageView) pager3.findViewById(R.id.guide_pager3);
        pageTitle3.setImageResource(R.mipmap.guide_page3);

        pager3.setOnClickListener(this);


        ArrayList<View> views= new ArrayList<>();
        views.add(pager1);
        views.add(pager2);
        views.add(pager3);

        OrAdapter adapter = new OrAdapter(views);
        pager.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == pager3.getId()){
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
            finish();
        }
    }
}
