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

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private List<ItemContact> ItemList;
    private Context context;


    public ContactAdapter(List<ItemContact> ItemList, Context context) {

        this.ItemList= ItemList;
        this.context = context;
    }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contact, null);

        ContactViewHolder rcv = new ContactViewHolder(view);
        return rcv;

    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, final int position) {

        holder.title.setText(ItemList.get(position).getTitle());
        holder.name1.setText(ItemList.get(position).getName1());
        holder.name_2.setText(ItemList.get(position).getName2());
        holder.name_3.setText(ItemList.get(position).getName3());
        holder.name_4.setText(ItemList.get(position).getName4());




    }



    @Override
    public int getItemCount() {
        return this.ItemList.size();
    }
}
