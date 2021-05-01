



package assessment1;
/*
Description: Assessment 1
*/

/*
Name: Wellington Pena
Date: 06/11/2020
Location: Edinburgh College – Sighthill Campus
Version: 1.0
Notes: none
*/

import java.util.Scanner;

class Assessment1 {

    public static void main(String[] args) {
        //Calls for the method that asks for Admin name
        //and stores it in a variable.
        String name = enter_name();

        //Loop will execute menu until condition changes (exit = true).
        boolean exit = false;
        do {
            exit = welcome_menu(name);
            System.out.println("\n");
        } while ( !exit );
    }
    //Method that asks for admin name and stores it in a variable.
    public static String enter_name() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter admin name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name);
        return name;
    }
    //Method that presents the menu to the user
    //It will always return false unless user choose option 3
    public static boolean welcome_menu(String name) {
        System.out.printf("Please choose one of the following options: %n" +
                "Option 1: 'User Name' - Generates user name. %n" +
                "Option 2: 'Factorial' - Calculates factorial of a number. %n" +
                "Option 3: 'QUIT' - Will exit the program. %n" +
                "Enter choice: ");

        //This interrupt will take an option from the user
        Scanner keyboard = new Scanner(System.in);
        String option = keyboard.next();

        //Will execute and option based on user input
        switch (option) {

            case "1":
                System.out.print("This is option 1 " + name);
                //Calls methods for the user to enter first and last name.
                String fname = enter_first_name();
                String lname = enter_last_name();
                //Use of substring() method to take the initials.
                //Use of toUppercase() method to force uppercase.
                System.out.println(fname.substring(0,1).toUpperCase() +
                        lname.substring(0,1).toUpperCase() + lname.substring(1));

                break;
            case "2":
                System.out.printf("This is option 2 " + name + "%n"
                        + "Enter a positive whole number greater than 0: ");

                try {
                    Scanner sc = new Scanner(System.in);
                    int userNum = sc.nextInt();
                    String factNumResult = factorial(userNum);
                    if (factNumResult.equals("")) {
                        System.out.println("Enter a positive whole number greater than 0");
                    } else {
                        System.out.println(factNumResult);
                    }
                } catch (Exception e){
                    System.out.println("Invalid input.");
                }
                break;
            case "3":
                System.out.printf("This is option 3 " + name + "%nexiting the program %nGoodbye!");


                return true;
        }

        return false;

    }

    //Method that takes user's input (first name)
    public static String enter_first_name() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter first name: ");
        String staffFName = sc.nextLine();
        return staffFName;
    }
    //Method that takes user's input (last name name)
    public static String enter_last_name() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter last name: ");
        String staffLName = sc.nextLine();
        return staffLName;
    }

    //Method to calculate factorial of user's number.
    //Takes user's number input as argument
    public static String factorial(int fact) {
        //If statement for negative numbers, 0 and 1 options

        if (fact < 0){
            return "";
        } else if (fact < 2){
            return "The result is = 1";
        }
        //for loop to calculate factorial number
        int f = 1;
        String out ="";
        for (int i = fact; i >= 2; i--){
            f *= i;
            out +=i + " * ";
        }
        out += "1 = " + f;
        //Example fact = 5
        // f = 1 * 5
        // f = 5 * 4
        // f = 20 * 3
        // f = 60 * 2

        return out;
    }

}

