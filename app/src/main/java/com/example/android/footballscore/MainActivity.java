package com.example.android.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreAlahly = 0;
    int scoreZamalek = 0;
    int foulsAlahly = 0;
    int foulsZamalek = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View v){
        scoreAlahly = 0;
        scoreZamalek = 0;
        foulsAlahly = 0;
        foulsZamalek = 0;
        displayForAlahly(scoreAlahly);
        displayFoulsForAlahly(foulsAlahly);
        displayForZamalek(scoreZamalek);
        displayFoulsForZamalek(foulsZamalek);
    }
    public void displayForAlahly(int score){
        TextView scoreView = (TextView)findViewById(R.id.pointsA_text_view);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsForAlahly(int fouls){
        TextView scoreView = (TextView)findViewById(R.id.foulsA_text_view);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayForZamalek(int score){
        TextView scoreView = (TextView)findViewById(R.id.pointsZ_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForZamalek(int fouls){
        TextView scoreView = (TextView)findViewById(R.id.foulsZ_text_view);
        scoreView.setText(String.valueOf(fouls));
    }
    public void addThreePointsForAlhly(View v){
        scoreAlahly = scoreAlahly + 3;
        displayForAlahly(scoreAlahly);
    }
    public void addOnePointForAlhly(View v){
        scoreAlahly = scoreAlahly + 1;
        displayForAlahly(scoreAlahly);
    }
    public void addFoulsForAlahly(View v){
        foulsAlahly = foulsAlahly + 1;
        displayFoulsForAlahly(foulsAlahly);
    }

    public void addThreePointsForZamalek(View v){
        scoreZamalek = scoreZamalek + 3;
        displayForZamalek(scoreZamalek);
    }
    public void addOnePointForZamalek(View v){
        scoreZamalek = scoreZamalek + 1;
        displayForZamalek(scoreZamalek);
    }
    public void addFoulsForZamalek(View v){
        foulsZamalek = foulsZamalek + 1;
        displayFoulsForZamalek(foulsZamalek);
    }
}
