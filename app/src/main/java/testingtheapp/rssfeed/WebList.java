package testingtheapp.rssfeed;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebList extends Activity {
    WebView webview5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_list);
        webview5=(WebView)findViewById(R.id.webView5);
        Intent intent=getIntent();
        String url=intent.getStringExtra("link");
        webview5.setWebViewClient(new WebViewClient());
        webview5.loadUrl(url);
    }

}
