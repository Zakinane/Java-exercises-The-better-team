// 1 - write a console app that scans user name & print Hello <user-name> 

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        // Declaration of the input variable
        Scanner input = new Scanner(System.in);
        
        // Getting the name
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        // Printing the name
        System.out.println("Hello " + name);
    }
}
