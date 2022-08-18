package com.example.projektthomasheinrich;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton;
    private EditText usernameTV;
    private EditText passwordTV;
    private String username = "TommyLee";
    private final String password = "qwertz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.idLoginButton);
        loginButton.setOnClickListener(this);

        usernameTV = findViewById(R.id.idUserName);
        passwordTV = findViewById(R.id.idPassword);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        String name = usernameTV.getText().toString();
        String pwd = passwordTV.getText().toString();

        if (username.equals("") || pwd.equals("")) {
            Toast.makeText(this, "Beide Felder ausfüllen!", Toast.LENGTH_LONG).show();
        }
        if (loginButton.getId() == v.getId()) {
            if (pwd.equals(password) && name.equals(username))  {
                SharedPreferences sp = getSharedPreferences("com.example.projektthomasheinrich", Context.MODE_PRIVATE);
                String uname = sp.getString("username", "");
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username", name);
                editor.apply();
                intent = new Intent(this, MainMenu.class);
                Toast.makeText(this, name, Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this, "Benutzername oder Passwort falsch!", Toast.LENGTH_LONG).show();
            }
        }

        if (intent != null) {
            startActivity(intent);
        }
    }

}