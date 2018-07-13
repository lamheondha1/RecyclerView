package com.example.lam.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AppAdapter extends RecyclerView.Adapter<AppAdapter.RecyclerViewHolder> {
    private ArrayList<AppEntity> mListApp;
    private LayoutInflater inflater;
    public AppAdapter(ArrayList<AppEntity> mListApp, LayoutInflater inflater) {
        this.mListApp = mListApp;
        this.inflater = inflater;
    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(inflater.from(parent.getContext()).inflate(R.layout.item_app,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        AppEntity app = mListApp.get(position);
        holder.mTxtPhim.setText(app.getmNamePhim());
        holder.mIcPhim.setImageResource(app.getmIcphim());
    }
    @Override
    public int getItemCount() {
        return mListApp.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView  mTxtPhim;
        ImageView mIcPhim;

     public RecyclerViewHolder( View itemView) {
         super(itemView);
         mIcPhim = itemView.findViewById(R.id.ic_ph);
         mTxtPhim = itemView.findViewById(R.id.txt_ph);
     }
 }
}
