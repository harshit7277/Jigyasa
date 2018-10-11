package com.gitjaipur.jigyasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class EventDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);


        int eventSelected = getIntent().getIntExtra("EVENT_ID",-1);
        Toast.makeText(this, "Event Position"+ eventSelected, Toast.LENGTH_SHORT).show();
    }
}