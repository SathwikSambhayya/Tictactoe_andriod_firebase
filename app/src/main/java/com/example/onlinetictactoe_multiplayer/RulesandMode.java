package com.example.onlinetictactoe_multiplayer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RulesandMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rulesand_mode);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("GAME RULES");


    }

    public void Buonline(View view) {
        Intent intent=new Intent(RulesandMode.this,MainActivity.class);
        startActivity(intent);
    }

    public void Buoffline(View view) {
        Intent intent=new Intent(RulesandMode.this,PlayOffline.class);
        startActivity(intent);
    }
}