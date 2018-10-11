package com.gitjaipur.jigyasa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Harshit on 7/4/2018.
 */

class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView Branch;
    public TextView text;
    private Context context;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        context= itemView.getContext();
        Branch = (ImageView) itemView.findViewById(R.id.branch);
        text =  (TextView)itemView.findViewById(R.id.text_spon);
    }



    @Override
    public void onClick(View v) {
      //  Toast.makeText(v.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();

      /*  if (getPosition()==0) {
            Intent intent = new Intent(context, binary.class);
            context.startActivity(intent);
        }*/


    }


}
