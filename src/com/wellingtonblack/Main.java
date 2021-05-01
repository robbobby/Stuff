package com.wellingtonblack;

import java.util.ArrayList;
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
//                String username = input.nextLine();
//                if (username.equals(Login.getUserName()))
                    isUsernameInputCorrect = true;
                System.out.println("Incorrect username, please try again");
            }

            boolean isPasswordInputCorrect = false;
            while (!isPasswordInputCorrect) {
                System.out.print("Please input password:");
//                String password = input.nextLine();
//                if (password.equals(Login.getPassword()))
                    isPasswordInputCorrect = true;
                System.out.println("Incorrect password, please try again");
            }

            Specialisation specialisation = (Specialisation) chooseSpecialsation(seed.competition.getSpecialisationList(), input);

            Team team = (Team) chooseSpecialsation(specialisation.getTeams(), input);

            isRunning = false;
        }
    }

    private static IName chooseSpecialsation(ArrayList<?> specialisationList, Scanner input) {
        System.out.println("Choose a specialisation:");
        for (int i = 0; i < specialisationList.size(); i++) {
                System.out.print("Option " + (i + 1) + " ");
                IName objectFromList = (IName) specialisationList.get(i);
                System.out.println(objectFromList.getName());
            }
        while (true) {
            try {
                String choice = input.nextLine();
                return (IName) specialisationList.get(Character.getNumericValue(choice.charAt(0 -1 )));
            } catch (Exception e) {
                chooseSpecialsation(specialisationList, input);
            }
        }
    }

}
