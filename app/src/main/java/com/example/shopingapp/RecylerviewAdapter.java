package com.example.shopingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecylerviewAdapter extends RecyclerView.Adapter<RecylerviewAdapter.ProgrammingViewHolder> {
    Context applicationcontext;
    ArrayList<one>arrayList;


    private String[] data;
    public RecylerviewAdapter(Context context, String[] data)
    {
        this.data=data;
    }
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
           View view=inflater.inflate(R.layout.fragment_one, viewGroup, false);
           ProgrammingViewHolder programmingViewHolder=new ProgrammingViewHolder(view);
           return programmingViewHolder;

    }
    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int positon) {






    }
    private class  MyHolder extends RecyclerView.ViewHolder
    {

        public TextView textView;
         public ImageView imageView;
        public MyHolder(View itemView){
            super(itemView);
            textView.findViewById(R.id.textView);
            imageView.findViewById(R.id.imageView);
        }

    }

    @Override
    public int getItemCount()
    {
        return arrayList.size();
    }

    public  class ProgrammingViewHolder extends RecyclerView.ViewHolder{

        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

