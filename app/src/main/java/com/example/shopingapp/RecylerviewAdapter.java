package com.example.shopingapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecylerviewAdapter extends RecyclerView.Adapter<RecylerviewAdapter.ProgrammingViewHolder> {
    private String[] data;
    public RecylerviewAdapter(String[] data)
    {
        this.data=data;
    }
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater(R.layout.activity_main)
        return new RecylerviewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int positon) {
    }
    private class  MyHolder extends RecyclerView.ViewHolder
    {
        public MyHolder(View itemView){
            super(itemView);
        }

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class ProgrammingViewHolder extends RecyclerView.ViewHolder{

        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

