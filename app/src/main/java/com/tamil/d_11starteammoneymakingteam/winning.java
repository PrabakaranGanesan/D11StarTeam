package com.tamil.d_11starteammoneymakingteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class winning extends AppCompatActivity {
    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winning);

        webView2=(WebView)findViewById(R.id.winningview);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("http://starteam.unaux.com/winning-screenshots/");


        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed()
    {
        if (webView2.canGoBack())
        {
            webView2.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
