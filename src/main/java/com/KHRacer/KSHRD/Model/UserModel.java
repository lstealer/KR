package com.KHRacer.KSHRD.Model;

public class UserModel {
    private int id;
    private String name;
    private String password;
    private double avgScore;
    private int playedMatch;
    private String Role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public int getPlayedMatch() {
        return playedMatch;
    }

    public void setPlayedMatch(int playedMatch) {
        this.playedMatch = playedMatch;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public UserModel(){}

    public UserModel(int id, String name, String password, double avgScore, int playedMatch, String role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.avgScore = avgScore;
        this.playedMatch = playedMatch;
        Role = role;
    }


}
