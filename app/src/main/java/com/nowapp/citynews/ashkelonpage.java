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

public class ashkelonpage extends AppCompatActivity {
    private WebView wv;
    private ProgressDialog pd;
    String url = "https://www.ashqelon.net/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashkelonpage);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        wv = (WebView) findViewById(R.id.webview);
        pd = new ProgressDialog(ashkelonpage.this , R.style.Custom);
        pd.setMessage("חדשות בעיר - מעלה את אשקלון....");
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
