package com.gitjaipur.jigyasa;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webset extends AppCompatActivity {

    public SwipeRefreshLayout swipe;
    WebView webView;
    public Activity mActivity;
    String url ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webset);


        webView = findViewById(R.id.webView);
        swipe = findViewById(R.id.swipe);
        mActivity = Webset.this;

        url = getIntent().getStringExtra("URL");



        if (isNetworkAvailable()) {
            swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {

                    webView.setInitialScale(1);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setAppCacheEnabled(true);
                    webView.getSettings().setLoadWithOverviewMode(true);
                    webView.getSettings().setUseWideViewPort(true);
                    webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
                    webView.setScrollbarFadingEnabled(false);
                    webView.setWebChromeClient(
                            new WebChromeClient() {
                                public void onProgressChanged(WebView view, int progress) {
                                    //Make the bar disappear after URL is loaded, and changes string to Loading...
                                    Webset.this.setTitle("Loading...");
                                    mActivity.setProgress(progress * 100); //Make the bar disappear after URL is loaded

                                    // Return the app name after finish loading
                                    if (progress == 100)
                                        mActivity.setTitle(R.string.app_name);
                                }
                            });
                    webView.setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public boolean onKey(View v, int keyCode, KeyEvent event) {
                            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                                WebView webView = (WebView) v;

                                switch (keyCode) {
                                    case KeyEvent.KEYCODE_BACK:
                                        if (webView.canGoBack()) {
                                            webView.goBack();
                                            return true;
                                        }
                                        break;
                                }
                            }

                            return false;
                        }
                    });

                    webView.loadUrl(url);
                    swipe.setRefreshing(true);
                    webView.setWebViewClient(new WebViewClient() {

                        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                            webView.loadUrl("file:///android_assets/error.html");

                        }

                        public void onPageFinished(WebView view, String url) {

                            swipe.setRefreshing(false);
                        }

                    });
                }
            });


            webView.setInitialScale(1);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
            webView.setScrollbarFadingEnabled(false);
            webView.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView view, int progress) {
                    //Make the bar disappear after URL is loaded, and changes string to Loading...
                    mActivity.setTitle("Loading...");
                    mActivity.setProgress(progress * 100); //Make the bar disappear after URL is loaded

                    // Return the app name after finish loading
                    if (progress == 100)
                        mActivity.setTitle(R.string.app_name);
                }
            });
            webView.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (event.getAction() == KeyEvent.ACTION_DOWN) {
                        WebView webView = (WebView) v;

                        switch (keyCode) {
                            case KeyEvent.KEYCODE_BACK:
                                if (webView.canGoBack()) {
                                    webView.goBack();
                                    return true;
                                }
                                break;
                        }
                    }

                    return false;
                }
            });

            webView.loadUrl(url);
            swipe.setRefreshing(true);
            webView.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView view, int progress) {
                    //Make the bar disappear after URL is loaded, and changes string to Loading...
                    mActivity.setTitle("Loading...");
                    mActivity.setProgress(progress * 100); //Make the bar disappear after URL is loaded

                    // Return the app name after finish loading
                    if (progress == 100)
                        mActivity.setTitle(R.string.app_name);
                }
            });
            webView.setWebViewClient(new WebViewClient() {

                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                    webView.loadUrl("url");

                }

                public void onPageFinished(WebView view, String url) {

                    swipe.setRefreshing(false);
                }

            });


            webView.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDescription,
                                            String mimetype, long contentLength) {

                    Uri uri = Uri.parse(url);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        } else {
            AlertDialog dialog = new AlertDialog.Builder(this)
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
        }

    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService( Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
