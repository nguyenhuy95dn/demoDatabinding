package com.example.age.demobinding2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<SportViewModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView
            .addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mRecyclerView.setAdapter(new RecycleViewAdapter(this, getData()));
    }

    private List<SportViewModel> getData() {
        SportViewModel model = new SportViewModel();
        model.sportName = getString(R.string.title_football);
        model.imgSrcId.set(R.drawable.white_star);
        data.add(model);
        model = new SportViewModel();
        model.sportName = getString(R.string.title_football);
        model.imgSrcId.set(R.drawable.white_star);
        data.add(model);
        model = new SportViewModel();
        model.sportName = getString(R.string.title_football);
        model.imgSrcId.set(R.drawable.white_star);
        data.add(model);
        model = new SportViewModel();
        model.sportName = getString(R.string.title_football);
        model.imgSrcId.set(R.drawable.white_star);
        data.add(model);
        return data;
    }
}
