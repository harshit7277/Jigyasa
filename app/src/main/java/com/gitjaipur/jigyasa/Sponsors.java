package com.gitjaipur.jigyasa;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Sponsors extends Fragment {
    public Activity mActivity;
    private LinearLayoutManager Layout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.sponsors, container,false);
        mActivity = Sponsors.this.getActivity();

        List<ItemObject> rowListItem =getAllItemList();
        Layout = new LinearLayoutManager(mActivity);


        RecyclerView rView = (RecyclerView)myview.findViewById(R.id.recycler_view);
        rView.setLayoutManager(Layout);


        RecyclerViewAdapter rcAdapter;
        rcAdapter = new RecyclerViewAdapter(rowListItem,mActivity);
        rView.setAdapter(rcAdapter);

        return myview;
    }

    public List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<ItemObject>();

        allItems.add(new ItemObject( R.drawable.forsk,"Execution partner"));
        allItems.add(new ItemObject( R.drawable.hunger,"Meal Partner"));
        allItems.add(new ItemObject( R.drawable.idiot,"Marketing Partner"));

        return allItems;
    }
}
