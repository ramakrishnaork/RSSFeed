package testingtheapp.rssfeed;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class PlayerRankings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_rankings);
        WebView plyers=(WebView)findViewById(R.id.webView2);
        plyers.loadUrl("http://www.relianceiccrankings.com/");
    }
}
