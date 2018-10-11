package com.gitjaipur.jigyasa;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        isNetworkAvailable();
        if (isNetworkAvailable() == true) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    final Intent anotherpage = new Intent(SplashActivity.this, MainActivity.class);
                    SplashActivity.this.startActivity(anotherpage);

                    SplashActivity.this.finish();
                }
            }, 3000);
        } else {

            final AlertDialog dialog = new AlertDialog.Builder(this)
                    .setTitle(" Error ")
                    .setMessage("Pleae connect to a network?")
                    .setPositiveButton("Retry",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    isNetworkAvailable();
                                }
                            }).create();
            dialog.show();
            new CountDownTimer(5000, 1000) {
                public void onTick(long millisUntilFinished) {
                    dialog.show();
                }

                public void onFinish() {
                    dialog.cancel();
                }
            }.start();

        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService( Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
