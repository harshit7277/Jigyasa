package com.gitjaipur.jigyasa;

import android.app.Activity;
import android.content.Intent;

public class EventDetails {

    public static void showEvent(Activity mActivity, int position) {

        switch(position){


            case 0 :  Intent innov = new Intent(mActivity,Webset.class);
                innov.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=INNOVATION");
                mActivity.startActivity(innov);
                break;

            case 1:    Intent rf = new Intent(mActivity,Webset.class);
                rf.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=ROBO-FLOOR");
                mActivity.startActivity(rf);
                break;
            case  2:    Intent hc = new Intent(mActivity,Webset.class);
                hc.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=hackathon");
                mActivity.startActivity(hc);
                break;
            case  3:    Intent gw = new Intent(mActivity,Webset.class);
                gw.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=GAMING%20ADDA");
                mActivity.startActivity(gw);
                break;
            case  4:    Intent cw = new Intent(mActivity,Webset.class);
                cw.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=CYBER%20WORLD");
                mActivity.startActivity(cw);
                break;
            case  5:    Intent lt = new Intent(mActivity,Webset.class);
                lt.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=LITERARY");
                mActivity.startActivity(lt);
                break;
            case  6:    Intent bom = new Intent(mActivity,Webset.class);
                bom.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=BRAIN-O-MANIA");
                mActivity.startActivity(bom);
                break;
            case  7:    Intent bob = new Intent(mActivity,Webset.class);
                bob.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=BATTLE%20OF%20BANDS");
                mActivity.startActivity(bob);
                break;
            case  8:    Intent de = new Intent(mActivity,Webset.class);
                de.putExtra("URL","https://jigyasagtc.com/apply/show_events.php?ec=DEVELOPERS%20EVOLUTION");
                mActivity.startActivity(de);
                break;

        }
    }
}