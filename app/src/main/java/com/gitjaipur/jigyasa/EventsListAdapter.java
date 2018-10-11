package com.gitjaipur.jigyasa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


// Custom adapter class that displays a list of all events in a GridView
public class EventsListAdapter extends BaseAdapter {

    // Keeps track of the context and list of images to display
    private Context mContext;
    private List<Integer> mImageIds;
    private List<String> mEventNames;

    /**
     * Constructor method
     * @param imageIds The list of images to display
     */
    public EventsListAdapter(Context context, List<Integer> imageIds, List<String> eventNames) {
        mContext = context;
        mImageIds = imageIds;
        mEventNames = eventNames;
    }

    /**
     * Returns the number of items the adapter will display
     */
    @Override
    public int getCount() {
        return mImageIds.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /**
     * Creates a new ImageView for each item referenced by the adapter
     */
    public View getView(final int position, View convertView, ViewGroup parent) {
        View gridItemView = convertView;

        if (gridItemView == null) {
            // If the view is not recycled, this creates a new ImageView to hold an image and
            // a textView
            gridItemView = LayoutInflater.from(mContext).inflate(R.layout.events_grid_item,
                    parent, false);
        }


        ImageView eventLogoImage = (ImageView) gridItemView.findViewById(R.id.event_logo_iv);
        TextView eventNameTv = (TextView) gridItemView.findViewById(R.id.event_name_tv);
        // Set the image resource and return the newly created ImageView
        eventLogoImage.setImageResource(mImageIds.get(position));
        eventNameTv.setText(mEventNames.get(position));

        return gridItemView;
    }

}