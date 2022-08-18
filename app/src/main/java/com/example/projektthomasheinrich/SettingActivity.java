package com.example.projektthomasheinrich;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText changeName;
    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        changeName = findViewById(R.id.idChangeName);
        confirm = findViewById(R.id.idSetConfirm);

        confirm.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {
        Intent intent = null;
        String username = changeName.getText().toString();
        if(confirm.getId() == v.getId()){
            SharedPreferences sp = getSharedPreferences("com.example.projektthomasheinrich", Context.MODE_PRIVATE);
            String uname = sp.getString("username", "");
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("username", username);
            editor.apply();
            intent = new Intent(this, MainMenu.class);
        }
        if(intent != null){
            startActivity(intent);
        }

    }
}
