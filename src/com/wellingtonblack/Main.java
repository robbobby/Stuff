package com.wellingtonblack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Seed seed = new Seed();

        boolean isRunning = true;
        while(isRunning) {
            Scanner input = new Scanner(System.in);
            boolean isUsernameInputCorrect = false;
            while (!isUsernameInputCorrect) {
                System.out.print("Please input username:");
                String username = input.nextLine();
                if (username.equals(Login.getUserName()))
                    isUsernameInputCorrect = true;
                else
                    System.out.println("Incorrect username, please try again");
            }

            boolean isPasswordInputCorrect = false;
            while (!isPasswordInputCorrect) {
                System.out.print("Please input password:");
                String password = input.nextLine();
                if (password.equals(Login.getPassword()))
                    isPasswordInputCorrect = true;
                else
                    System.out.println("Incorrect password, please try again");
            }
            boolean loggedIn = true;

            System.out.println("Do you wish to add points to a team?");
            String answer = input.nextLine();

            ArrayList<Specialisation> specialisations = userChoice(seed.competition.getSpecialisationList(), input);
            Specialisation specialisation = specialisations.get(0);
            ArrayList<Team> teamList = userChoice(specialisation.getTeams(), input);
            Team team = teamList.get(0);

            specialisation.getTeams().get(1).getLadder().addPoints(10);

            System.out.println("How many points did this team score?");
            int pointsToAdd = input.nextInt();
            team.getLadder().addPoints(pointsToAdd);
            System.out.println("The winning team is: " + GetWinningTeam(specialisation.getTeams()).getName());
            isRunning = false;
        }
    }


    private static Team GetWinningTeam(ArrayList<Team> teamList) {
        Team winningTeam = null;
        for (int i = 0; i < teamList.size(); i++) {
            if(i == 0) {
                winningTeam = teamList.get(i);
            }
            if(teamList.get(i).getLadder().pointsScored > winningTeam.getLadder().pointsScored) {
                winningTeam = teamList.get(i);
            }
        }
        return winningTeam;
    }

    private static <T extends IName> ArrayList<T> userChoice(ArrayList<T> itemList, Scanner input) {
        System.out.println("Choose a specialisation:");
        for (int i = 0; i < itemList.size(); i++) {
                System.out.print("Option " + (i + 1) + " ");
                IName objectFromList = itemList.get(i);
                System.out.println(objectFromList.getName());
            }
        while (true) {
            try {
                String choice = input.nextLine();
                return new ArrayList<T>(Collections.singletonList(
                        itemList.get(Character.getNumericValue(choice.charAt(0) -1))));

            } catch (Exception e) {
                userChoice(itemList, input);
            }
        }
    }

}
