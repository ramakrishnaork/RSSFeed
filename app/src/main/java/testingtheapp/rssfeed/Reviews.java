package testingtheapp.rssfeed;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class Reviews extends Activity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        WebView web=(WebView)findViewById(R.id.webrev);
        web.loadUrl("http://crictechindia.blogspot.in/");
    }

}
