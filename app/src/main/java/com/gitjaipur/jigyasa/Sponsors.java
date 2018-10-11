package com.gitjaipur.jigyasa;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

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

        List<ItemObject> sponsors =getAllItemList();

        GridView sponsorsGridView = (GridView) myview.findViewById(R.id.gridview);

        SponsorsListAdapter sponsorsListAdapter = new SponsorsListAdapter(mActivity, sponsors);

        sponsorsGridView.setAdapter(sponsorsListAdapter);

        return myview;
    }

    public List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<ItemObject>();

        allItems.add(new ItemObject( R.drawable.triumph,""));
        allItems.add(new ItemObject( R.drawable.yb,""));
        allItems.add(new ItemObject( R.drawable.tripsaa,""));
        allItems.add(new ItemObject( R.drawable.zoomcar,""));
        allItems.add(new ItemObject( R.drawable.rsz_short,""));
        allItems.add(new ItemObject( R.drawable.tn,""));
        allItems.add(new ItemObject( R.drawable.rsz_1corexart,""));
        allItems.add(new ItemObject( R.drawable.rsz_arena_anim,""));
        allItems.add(new ItemObject( R.drawable.rsz_forsk,""));
        allItems.add(new ItemObject( R.drawable.rsz_hadda,""));
        allItems.add(new ItemObject( R.drawable.rsz_idi_diar,""));
        allItems.add(new ItemObject( R.drawable.rsz_kalam,""));
        allItems.add(new ItemObject( R.drawable.rsz_kaya,""));
        allItems.add(new ItemObject( R.drawable.rsz_kloh,""));
        allItems.add(new ItemObject( R.drawable.rsz_onnbike,""));
        allItems.add(new ItemObject( R.drawable.rsz_pitb,""));
        allItems.add(new ItemObject( R.drawable.rsz_adhoc,""));




        return allItems;
    }
}
