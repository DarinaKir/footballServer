package com.ashcollege.entities;

public class Gamble {
    private int id;
    private User user;
    private Match match;
    private int team;
    private int sum;
    private double ratio;
    private Boolean isCorrect;

    public Gamble() {

    }

    public Gamble(User user, Match match, int team, int sum,double ratio) {
        this.user = user;
        this.match = match;
        this.team = team;
        this.sum = sum;
        this.isCorrect = null;
        this.ratio = ratio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        if (sum >= 0) {
            this.sum = sum;
        }
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
}