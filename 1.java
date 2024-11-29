// 1 - write a console app that scans user name & print Hello <user-name> 

import java.util.Scanner;

public class Exo1 {

    // for styleee
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        // Declaration of the input variable
        Scanner input = new Scanner(System.in);

        // Getting the name
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        // Easter egg
        if (name.compareToIgnoreCase("Rayane") == 0) {
            System.out.println("Hey " + GREEN + name + RESET + "!");
            return;

        }

        // printing the name
        System.out.println("Hello " + name);

        input.close();

    }
}
