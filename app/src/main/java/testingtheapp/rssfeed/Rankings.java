package testingtheapp.rssfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rankings extends Activity implements View.OnClickListener {
    Button trankings;
    Button prankings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rankings);
        trankings= (Button) findViewById(R.id.trankings);
        prankings= (Button) findViewById(R.id.prankings);
        trankings.setOnClickListener(this);
        prankings.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.prankings:
                Intent intent_plyr = new Intent(Rankings.this,PlayerRankings.class);
                startActivity(intent_plyr);
                break;
            case R.id.trankings:
                Intent intent_teamrank = new Intent(Rankings.this,TeamRankings.class);
                startActivity(intent_teamrank);
                break;
            default:
                break;
        }

        }
}
