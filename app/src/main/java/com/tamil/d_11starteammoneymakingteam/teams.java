package com.tamil.d_11starteammoneymakingteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class teams extends AppCompatActivity {
    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);

        webView1=(WebView)findViewById(R.id.teamsview);

        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("http://starteam.unaux.com");

        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);





    }

    @Override
    public void onBackPressed()
    {
        if (webView1.canGoBack())
        {
            webView1.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

}
