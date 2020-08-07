package testingtheapp.rssfeed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.fixindia);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

        public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                Intent intent_news = new Intent(Main2Activity.this,News.class);
                startActivity(intent_news);
                break;
            case R.id.btn2:
                Intent intent_players = new Intent(Main2Activity.this,players.class);
                startActivity(intent_players);
                break;
            case R.id.btn3:
                Intent intent_fixworld = new Intent(Main2Activity.this,FixturesWorld.class);
                startActivity(intent_fixworld);
                break;
            case R.id.btn4:
                Intent intent_rankings = new Intent(Main2Activity.this,Rankings.class);
                startActivity(intent_rankings);
                break;
            case R.id.btn5:
                Intent intent_reviews = new Intent(Main2Activity.this,Reviews.class);
                startActivity(intent_reviews);
                break;
            case R.id.fixindia:
                Intent intent_fix = new Intent(Main2Activity.this,Fixture.class);
                startActivity(intent_fix);
            default:
                break;
        }


    }

    }

