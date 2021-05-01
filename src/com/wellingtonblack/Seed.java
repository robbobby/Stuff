package com.wellingtonblack;

import java.util.ArrayList;
import java.util.Arrays;

public class Seed {
    Teacher teacher = new Teacher("Jorge");
    Teacher teacher1 = new Teacher("John");
    Judge judge = new Judge("John");
    Judge judge1 = new Judge("Elizabeth");
    Judge judge2 = new Judge("Jorge");
    Student student = new Student("Wellington", 1, "welly@email.com", "01111111", StudentStatus.FULL_TIME);
    Student student1 = new Student("Craig", 3, "Craig@email.com", "01111112", StudentStatus.APPRENTICE);
    Student student2 = new Student("David", 2, "David@email.com", "01111133", StudentStatus.PART_TIME);
    Student student3 = new Student("Francis", 4, "Francis@email.com", "01111114", StudentStatus.FULL_TIME);
    Project project = new Project("Salsa Project");
    Team team = new Team("SightHill", "SightHill Cool College", project,
            new ArrayList<>(Arrays.asList(student, student1, student2, student3)),
            teacher, new Ladder());

    Team team1 = new Team("Granton", "SightHill Cool College", project,
            new ArrayList<>(Arrays.asList(student, student1, student2, student3)),
            teacher, new Ladder());

    Specialisation specialisation = new Specialisation("Software Development",
            new ArrayList<>(Arrays.asList(judge, judge1)),
            new ArrayList<>(Arrays.asList(team, team1)));
    Specialisation specialisation1 = new Specialisation("Networking",
            new ArrayList<>(Arrays.asList(judge, judge1)),
            new ArrayList<>(Arrays.asList(team, team1)));
    Specialisation specialisation2 = new Specialisation("Web Design",
            new ArrayList<>(Arrays.asList(judge, judge1)),
            new ArrayList<>(Arrays.asList(team, team1)));

    Competition competition = new Competition(
            new ArrayList<>(Arrays.asList(specialisation, specialisation1, specialisation2)));

}
