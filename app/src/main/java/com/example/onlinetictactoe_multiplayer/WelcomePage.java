package com.example.onlinetictactoe_multiplayer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tic tac toe");

        Button mbutton = findViewById(R.id.button);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new  Intent(WelcomePage.this, RulesandMode.class);
                startActivity(intent);
            }
        });
    }
}