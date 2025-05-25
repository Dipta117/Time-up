package com.example.survive;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);  // ✅ Enable JavaScript
        webSettings.setDomStorageEnabled(true);  // ✅ Enable Local Storage (if needed)
        webSettings.setAllowContentAccess(true); // ✅ Allow access to assets
        webSettings.setAllowFileAccess(true);    // ✅ Allow file access
        webSettings.setLoadsImagesAutomatically(true);

        webView.setWebChromeClient(new WebChromeClient()); // ✅ Allow JS alerts & console logs
        webView.setWebViewClient(new WebViewClient());

        // Load the local HTML file
        webView.loadUrl("file:///android_asset/table.html");
    }
}
