package com.gitjaipur.jigyasa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Harshit on 7/4/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> ItemList;
    private Context context;


    public RecyclerViewAdapter(List<ItemObject> ItemList, Context context) {

        this.ItemList= ItemList;
        this.context = context;
    }


    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design, null);

        RecyclerViewHolders rcv = new RecyclerViewHolders(view);
       return rcv;

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, final int position) {

        holder.Branch.setImageResource(ItemList.get(position).getPhoto());
        holder.text.setText(ItemList.get(position).getText());



    }



    @Override
    public int getItemCount() {
        return this.ItemList.size();
    }
}
