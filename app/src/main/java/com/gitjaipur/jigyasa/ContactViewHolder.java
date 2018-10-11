package com.gitjaipur.jigyasa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Harshit on 7/4/2018.
 */

class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    public TextView title,name1,name_2,name_3,name_4;
    private Context context;

    public ContactViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        context= itemView.getContext();

       title =  (TextView)itemView.findViewById(R.id.title);
        name1 =itemView.findViewById(R.id.name);
        name_2 =itemView.findViewById(R.id.name2);
        name_3 =itemView.findViewById(R.id.name3);
        name_4 =itemView.findViewById(R.id.name4);

    }



    @Override
    public void onClick(View v) {
        //  Toast.makeText(v.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).EventDetails();

      /*  if (getPosition()==0) {
            Intent intent = new Intent(context, binary.class);
            context.startActivity(intent);
        }*/


    }


}
