package com.example.projektthomasheinrich;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HighscoreListAdapter extends RecyclerView.Adapter<HighscoreListAdapter.HighscoreListViewHolder> {

    private ArrayList<ScoreListEintrag> highscoreArrayList;

    HighscoreListAdapter(ArrayList<ScoreListEintrag> highscoreArrayList){
        this.highscoreArrayList = highscoreArrayList;
    }

    @NonNull
    @Override
    public HighscoreListAdapter.HighscoreListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_highscore_list_item, parent, false);

        HighscoreListViewHolder highscoreListViewHolder = new HighscoreListViewHolder(v);

        return highscoreListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HighscoreListAdapter.HighscoreListViewHolder holder, int position) {

        ScoreListEintrag scoreListEintrag = highscoreArrayList.get(position);

        holder.spielerNameTV.setText(scoreListEintrag.getSpielername());
        holder.levelTV.setText("" + scoreListEintrag.getLvl());
        holder.pointsTV.setText("" + scoreListEintrag.getPoints());

    }

    @Override
    public int getItemCount() {
        return highscoreArrayList.size();
    }

    public class HighscoreListViewHolder extends RecyclerView.ViewHolder {

        public TextView spielerNameTV, levelTV, pointsTV;

        public HighscoreListViewHolder(@NonNull View itemView) {
            super(itemView);

            spielerNameTV = itemView.findViewById(R.id.id_name);
            levelTV = itemView.findViewById(R.id.id_lvl);
            pointsTV = itemView.findViewById(R.id.id_points);

        }
    }
}
