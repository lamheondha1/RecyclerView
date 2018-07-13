package com.example.lam.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRcl;
    private ArrayList<AppEntity> listApp;
    private AppAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRcl = findViewById(R.id.rcl);
        createData();
        adapter = new AppAdapter(listApp,getLayoutInflater());
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mRcl.setLayoutManager(manager);
        mRcl.setAdapter(adapter);
    }
    private void createData() {
        listApp  = new ArrayList<>();
        listApp.add(new AppEntity(R.drawable.cbsg,getString(R.string.name_phim)));
        listApp.add(new AppEntity(R.drawable.dv,getString(R.string.name_phim1)));
        listApp.add(new AppEntity(R.drawable.st,getString(R.string.name_phim2)));
        listApp.add(new AppEntity(R.drawable.te,getString(R.string.name_phim3)));
    }
}
