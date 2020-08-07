package testingtheapp.rssfeed;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class Fixture extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixture);
        WebView fix=(WebView)findViewById(R.id.fix);
        fix.loadUrl("http://www.espncricinfo.com/india/content/team/6.html?template=fixtures");
    }

}
