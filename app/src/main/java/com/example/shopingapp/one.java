package com.example.shopingapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.shopingapp.R;

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
        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        RecylerviewAdapter.setAdapter(new RecylerviewAdapter(menuItem));
        RecylerviewAdapter.ProgrammingViewHolder(new(getContext(),menuItem));

        return view;
    }

}