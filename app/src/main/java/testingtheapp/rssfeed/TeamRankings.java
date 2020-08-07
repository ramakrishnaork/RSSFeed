package testingtheapp.rssfeed;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class TeamRankings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_rankings);
        WebView team=(WebView)findViewById(R.id.webView3);
        team.loadUrl("http://www.icc-cricket.com/team-rankings");
    }
}
