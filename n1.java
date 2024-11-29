// 1 - write a console app that scans user name & print Hello <user-name> 

import java.util.Scanner;

public class n1 {

    // for styleee
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        // Declaration of the input variable
        Scanner input = new Scanner(System.in);

        // Getting the name
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        // Greeting the person
        String greeting = name.equalsIgnoreCase("Rayane") 
        ? "Hey " + GREEN + name + RESET + "!" // Easter egg
        : "Hello " + name;

        // Printing the greetings
        System.out.println(greeting);

        input.close();
    }
}
