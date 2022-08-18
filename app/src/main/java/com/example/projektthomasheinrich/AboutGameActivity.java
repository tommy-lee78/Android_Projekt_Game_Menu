package com.example.projektthomasheinrich;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutGameActivity extends AppCompatActivity {

    private TextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_game);

        SharedPreferences sp = getSharedPreferences("com.example.projektthomasheinrich", MODE_PRIVATE);

        userName = findViewById(R.id.idAbout);
        String uname = sp.getString("username", "");
        userName.setText(uname);

    }
}
