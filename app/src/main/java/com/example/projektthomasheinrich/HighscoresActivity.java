package com.example.projektthomasheinrich;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HighscoresActivity extends AppCompatActivity {

    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore_list);

        ArrayList<ScoreListEintrag> highscoreList = createArrayList();

        HighscoreListAdapter highscoreListAdapter = new HighscoreListAdapter(highscoreList);
        rv = findViewById(R.id.idRV_HighscoreList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        rv.setLayoutManager(layoutManager);
        rv.setAdapter(highscoreListAdapter);

    }

    private ArrayList<ScoreListEintrag> createArrayList() {
        MainActivity un = new MainActivity();
        ArrayList<ScoreListEintrag> highscoreList = new ArrayList<>();

        SharedPreferences sp = getSharedPreferences("com.example.projektthomasheinrich", MODE_PRIVATE);

        highscoreList.add(new ScoreListEintrag(sp.getString("username", ""), 99, 999));
        highscoreList.add(new ScoreListEintrag("Batman", 23, 878));
        highscoreList.add(new ScoreListEintrag("Akira", 54, 823));
        highscoreList.add(new ScoreListEintrag("Spidey", 41, 769));
        highscoreList.add(new ScoreListEintrag("Kratos", 68, 734));
        highscoreList.add(new ScoreListEintrag("Gollum", 10, 701));
        highscoreList.add(new ScoreListEintrag("Venom", 84, 684));
        highscoreList.add(new ScoreListEintrag("Thor", 73, 652));
        highscoreList.add(new ScoreListEintrag("Hulk", 48, 608));
        highscoreList.add(new ScoreListEintrag("Sephiroth", 98, 588));

        return highscoreList;
    }

}
