package com.example.projektthomasheinrich;

public class ScoreListEintrag {

    private String spielername;
    private static String name;
    private int lvl, points;

    ScoreListEintrag(String spielername, int lvl, int points){
        this.spielername = spielername;
        this.lvl = lvl;
        this.points = points;
    }

    // Setter
    public void setSpielername(String spielername){
        this.spielername = spielername;
    }
    public void setLvl(int lvl){
        this.lvl = lvl;
    }
    public void setPoints(int points){
        this.points = points;
    }

    // Getter
    public String getSpielername(){
        return this.spielername;
    }
    public int getLvl(){
        return this.lvl;
    }
    public int getPoints(){
        return this.points;
    }


}
