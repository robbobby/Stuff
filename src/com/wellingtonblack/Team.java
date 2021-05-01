package com.wellingtonblack;

import java.util.ArrayList;

public class Team implements IName{
    private String name;
    private String collegeName;
    private Project project;
    private ArrayList<Student> teamMembers;
    private Teacher teacher;
    private Ladder ladder;
    private boolean winner = false;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public Team(String name, String collegeName, Project project, ArrayList<Student> teamMembers, Teacher teacher, Ladder ladder) {
        this.name = name;
        this.collegeName = collegeName;
        this.project = project;
        this.teamMembers = teamMembers;
        this.teacher = teacher;
        this.ladder = ladder;
    }

    public void addTeamMember(Student student) {
        teamMembers.add(student);
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }

    public void removeStudent(Student student) {
        teamMembers.remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public ArrayList<Student> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(ArrayList<Student> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public Teacher getTeachers() {
        return teacher;
    }

    public void setTeachers(Teacher teachers) {
        this.teacher = teacher;
    }

}
