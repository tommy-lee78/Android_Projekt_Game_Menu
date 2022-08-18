package com.example.projektthomasheinrich;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity implements View.OnClickListener{

    private Button startGameButton;
    private Button highscoreButton;
    private Button aboutGameButton;
    private Button settingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        startGameButton = findViewById(R.id.idStart);
        highscoreButton = findViewById(R.id.idScoreButton);
        aboutGameButton = findViewById(R.id.idInfo);
        settingButton = findViewById(R.id.idSetting);

        startGameButton.setOnClickListener(this);
        highscoreButton.setOnClickListener(this);
        aboutGameButton.setOnClickListener(this);
        settingButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent intent = null;
        if(startGameButton.getId() == v.getId()){
            intent = new Intent(MainMenu.this,StartGame_Activity.class);
        }
        if(highscoreButton.getId() == v.getId()){
            intent = new Intent(MainMenu.this, HighscoresActivity.class);
        }
        if(aboutGameButton.getId() == v.getId()){
            intent = new Intent(this, AboutGameActivity.class);
        }
        if(settingButton.getId() == v.getId()){
            intent = new Intent(this, SettingActivity.class);
        }
        if(intent != null){
            startActivity(intent);
        }
    }

}
