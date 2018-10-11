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

public class Contact extends Fragment {

    public Activity mActivity;
    private LinearLayoutManager Layout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.contact, container,false);
        mActivity = Contact.this.getActivity();


        List<ItemContact> rowListItem =getAllItemList();
        Layout = new LinearLayoutManager(mActivity);


        RecyclerView rView = (RecyclerView)myview.findViewById(R.id.recycler_view);
        rView.setLayoutManager(Layout);


       ContactAdapter  rcAdapter;
        rcAdapter = new ContactAdapter(rowListItem,mActivity);
        rView.setAdapter(rcAdapter);

        return myview;
    }

    public List<ItemContact> getAllItemList() {
        List<ItemContact> allItems = new ArrayList<ItemContact>();

        allItems.add(new ItemContact("ROBO FLOOR","Hemant Jagetiya  8560938368",
                "Chittvilas Kalal  9784608425","Ujjwal Singhal  94612277184","Anirudh Joshi  9461066973"));
       allItems.add(new ItemContact("GAMING ADDA","SABIR MD.   8561907548",
                "ROHIT KUMAR   8651197270","ASHIK KHAN    9509016520",""));
        allItems.add(new ItemContact("CYBER WORLD","MAYANK GARG    7737605609",
                "JAIPARKASH   9660859433","AKSHAT ASHU    7240181867","SAURAV KUMAR    7240181867"));
        allItems.add(new ItemContact("LITERARY","KRITI   7597960923",
                "ABHINAV SHARMA   9772269911","",""));
        allItems.add(new ItemContact("BRAIN-O-MANIA","Palak Singhal   7240109556",
                "Aditya Nagar   9571309494","Shivam Kumar   9460004782",""));
        allItems.add(new ItemContact("DEVELOPERS EVOLUTION","MANIT MANDELA   9460950957",
                "Hitesh Kotai   8058598104","Tushar Modi   8078668415",""));
        allItems.add(new ItemContact("INNOVATION","Atul Jain   8824636188",
                "Gaurav Kakhani    9782375396","",""));
        allItems.add(new ItemContact("BATTLE OF BANDS","PRIYANKA   9070152111",
                "Manit Mandela   9460950957","Makrand Thakkar   9772221182",""));
        allItems.add(new ItemContact("ACCOMMODATION","DUSHYANT SINGH BHATI  7023575668",
                "","",""));
        allItems.add(new ItemContact("ANUSHAASAN","DUSHYANT SINGH  7023575668",
                "SURENDRA SAINI   9024553731","",""));
        allItems.add(new ItemContact("SPONSORSHIP","AMAN LUNAWAT   7611926317",
                "HARSH AGARWAL   9571435388","",""));

        allItems.add(new ItemContact("PUBLICITY","PRIYASH JAIN   7728880154",
                "Atul Jain   8824636188","",""));
        allItems.add(new ItemContact("REGISTRATION DESK","Vijay Lakhotiya   9660393125",
                "Makrand Thakkar   9772221182","Saurav kumar   7240731360",""));
        allItems.add(new ItemContact("DEVELOPERS & DESIGNER","Saurav kumar   7240731360",
                "Makrand Thakkar   9772221182","Harshit kapoor  7277324983","Akshat Jain  7737240934"));

        return allItems;
    }

}
