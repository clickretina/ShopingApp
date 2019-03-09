package com.example.shopingapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.shopingapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class one extends Fragment {
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        final String[] menuItem = {"What is Andriod ?", "Andriod History", "Why Andriod ?", "Andriod Software Stack", "Dalvik Virtual Machine", "Art vs DAlvik"
                ,"Andriod Development Components"};
        ArrayList<one>arrayList =new ArrayList<>();


        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        RecylerviewAdapter myadapter=new RecylerviewAdapter(getContext(),menuItem);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext()) ;
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator() );


              recyclerView.setAdapter(myadapter);


        return view;
    }

}