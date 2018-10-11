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
public class SponsorsListAdapter extends BaseAdapter {

    // Keeps track of the context and list of images to display
    private Context mContext;
    private List<ItemObject> sponsorsObject;


    public SponsorsListAdapter(Context context, List<ItemObject> sponsorsObject) {
        mContext = context;
        this.sponsorsObject = sponsorsObject;
    }

    /**
     * Returns the number of items the adapter will display
     */
    @Override
    public int getCount() {
        return sponsorsObject.size();
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
            gridItemView = LayoutInflater.from(mContext).inflate(R.layout.sponsors_grid_item,
                    parent, false);
        }


        ImageView sponsorLogoImage = (ImageView) gridItemView.findViewById(R.id.sponsor_image);
        TextView sponsorNameTv = (TextView) gridItemView.findViewById(R.id.sponsor_text);

        // Set the image resource and return the newly created ImageView
        sponsorLogoImage.setImageResource(sponsorsObject.get(position).getPhoto());
        sponsorNameTv.setText(sponsorsObject.get(position).getText());

        return gridItemView;
    }

}