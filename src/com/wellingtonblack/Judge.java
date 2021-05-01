package com.wellingtonblack;

public class Judge extends Teacher {
    public Judge(String name) {
        super(name);
    }

    public void awardPoints(Team team, int points) {
        team.getLadder().addPoints(points);
    }
}
