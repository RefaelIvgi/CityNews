package com.nowapp.citynews;

import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class oryehudapage extends AppCompatActivity {

    private WebView wv;
    private ProgressDialog pd;
    String url ="https://www.ononews.co.il/%D7%97%D7%93%D7%A9%D7%95%D7%AA-%D7%90%D7%95%D7%A8-%D7%99%D7%94%D7%95%D7%93%D7%94/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oryehudapage);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        wv = (WebView) findViewById(R.id.webview);
        pd = new ProgressDialog(oryehudapage.this , R.style.Custom);
        pd.setMessage("חדשות בעיר - מעלה את אור יהודה....");
        wv.setWebViewClient(new Mybrowser(pd));
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.loadUrl(url);


    }

    public class Mybrowser extends WebViewClient {
        ProgressDialog pd;
        public Mybrowser(ProgressDialog pd) {
            this.pd = pd;
            pd.show();
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            if (pd.isShowing()) {
                pd.dismiss();
            }
        }
        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            Toast.makeText(getApplicationContext(),
                    "טעינת הדף נכשלה" + description, Toast.LENGTH_SHORT).show();
        }


    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction()== KeyEvent.ACTION_DOWN){

            switch (keyCode){

                case KeyEvent.KEYCODE_BACK:
                    if (wv.canGoBack()){

                        wv.goBack();
                    }
                    else {

                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
    }

