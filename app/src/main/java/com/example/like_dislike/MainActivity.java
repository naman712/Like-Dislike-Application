package com.example.like_dislike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int i = 0;
    int j=0;
    public void like(View view) {
        i += 1;
    }

    public void dislike(View view) {
        j +=1 ;
    }
    public void done(View view) {
        displayl(i);
        displayd(j);
    }
    public void displayl(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorel);
        scoreView.setText(String.valueOf(score));
    }
    public void displayd(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scored);
        scoreView.setText(String.valueOf(score));
    }

}