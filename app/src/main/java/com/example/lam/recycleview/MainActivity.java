package com.example.lam.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRclPhim;
    private ArrayList<AppEntity> mlistApp;
    private AppAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRclPhim = findViewById(R.id.rcl);
        createData();
        mAdapter = new AppAdapter(mlistApp,getLayoutInflater());
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mRclPhim.setLayoutManager(manager);
        mRclPhim.setAdapter(mAdapter);
    }
    private void createData() {
        mlistApp  = new ArrayList<>();
        mlistApp.add(new AppEntity(R.drawable.cbsg,getString(R.string.name_phim)));
        mlistApp.add(new AppEntity(R.drawable.dv,getString(R.string.name_phim1)));
        mlistApp.add(new AppEntity(R.drawable.st,getString(R.string.name_phim2)));
        mlistApp.add(new AppEntity(R.drawable.te,getString(R.string.name_phim3)));
    }
}
