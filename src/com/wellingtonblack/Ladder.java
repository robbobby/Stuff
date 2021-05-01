package com.wellingtonblack;

public class Ladder {
    int pointsScored = 0;

    public int getPointsScored() {
        return pointsScored;
    }

    public void addPoints(int points) {
        pointsScored+= points;
    }
}
