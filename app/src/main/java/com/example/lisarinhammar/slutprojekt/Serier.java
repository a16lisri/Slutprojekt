package com.example.lisarinhammar.slutprojekt;

/**
 * Created by Lisa Rinhammar on 2018-05-16.
 */

public class Serier {
    private int ID;
    private String name;
    private String login;
    private String company;
    private int release;
    private int cost;
    private String rating;
    private String genre;
    private String auxdata;


public Serier (int inID, String inName, String inLogin, String inCompany, int inRelease, int inCost, String inRating, String inGenre, String inAuxdata) {
    ID = inID;
    name=inName;
    login=inLogin;
    company=inCompany;
    release=inRelease;
    cost=inCost;
    rating=inRating;
    genre=inGenre;
    auxdata=inAuxdata;
}

    public String Lisasfunk(){
        String str=name;
        str+="  ";
        str+=release;
        str+=" mountain range and is ";
        str+=Integer.toString(Integer.parseInt(rating));
        str+="m";
        str+=" high.";
        return str;
    }
    @Override
    public String toString() {
        return name;
    }
}