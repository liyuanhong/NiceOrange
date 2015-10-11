package com.lyh.niceorange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;

public class MainActivity extends OrActivity {
    private PullToRefreshListView listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listData = (PullToRefreshListView)findViewById(R.id.pull_to_refresh_listview);

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        arr.add("1111111111");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        listData.setAdapter(arrayAdapter);
    }
}
