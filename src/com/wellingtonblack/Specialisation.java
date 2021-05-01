package com.wellingtonblack;

import java.util.ArrayList;

public class Specialisation implements IName {
    private String name;
    private ArrayList<Judge> judges;
    private ArrayList<Team> teams;

    public Specialisation(String name,  ArrayList<Judge> judges, ArrayList<Team> teams) {
        this.name = name;
        this.judges = judges;
        this.teams = teams;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }

    public void addJudge(Judge judge) {
        judges.add(judge);
    }

    public void removeJudge(Judge judge) {
        judges.remove(judge);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Judge> getJudges() {
        return judges;
    }

    public void setJudges(ArrayList<Judge> judges) {
        this.judges = judges;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

}
