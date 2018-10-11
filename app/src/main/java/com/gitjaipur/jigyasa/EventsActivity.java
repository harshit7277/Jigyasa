package com.gitjaipur.jigyasa;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.List;

public class EventsActivity extends Fragment {


    public Activity mActivity;
    ViewFlipper v_flippper;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.events, container, false);
        mActivity = EventsActivity.this.getActivity();
        super.onCreate(savedInstanceState);
        int iconSize = getResources().getDimensionPixelSize(android.R.dimen.app_icon_size);

        int images[]={R.drawable.main,R.drawable.arenacood};
        v_flippper = myview.findViewById(R.id.view_flip);
        for (int image: images){
            flipperImages(image);
        }



        GridView eventsGridView = (GridView) myview.findViewById(R.id.gridview);

        eventsGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                EventDetails.showEvent(mActivity, position);
            }
        });

        List<Integer> imageIds = new ArrayList<Integer>() {{
            add(R.drawable.rsz_innovation1);
            add(R.drawable.rsz_robo);
            add(R.drawable.rsz_hackathon);
            add(R.drawable.rsz_game);
            add(R.drawable.rsz_cyber1);
            add(R.drawable.rsz_ltr);
            add(R.drawable.rsz_bom);
            add(R.drawable.rsz_bob1);
            add(R.drawable.rsz_de);
        }};

        List<String> eventNames = new ArrayList<String>() {{
            add("Innovation");
            add("RoboFloor");
            add("Hackathon");
            add("Gaming Adda");
            add("Cyber World");
            add("Literary");
            add("Brain-o-mania");
            add("Battle of Band");
            add("Developer Evolution");
        }};

        EventsListAdapter eventsListAdapter = new EventsListAdapter(mActivity, imageIds, eventNames);

        eventsGridView.setAdapter(eventsListAdapter);

        return myview;
    }


        public void flipperImages(int image){
            ImageView imageView = new ImageView(mActivity);
            imageView.setBackgroundResource(image);

            v_flippper.addView(imageView);
            v_flippper.setFlipInterval(4000);
            v_flippper.setAutoStart(true);

            v_flippper.setInAnimation(mActivity,R.anim.slide_in_left);
            v_flippper.setOutAnimation(mActivity, R.anim.slide_out_right);
        }

}