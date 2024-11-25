// 4 - console application to deal with tables ( find max value/ find min value / order table AtoZ & ZtoA / deleting element from table / adding element to the table...)....
// Alll based on the users input your console should decide which opération it should execute 

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {

        // Declaration of the input variable
        Scanner input = new Scanner(System.in);

        // User fills up the table
        System.out.print("Enter the number of elements : ");
        int tableSize = input.nextInt();

        // Declaration + initialisation of the table
        int[] table = new int[tableSize];

        for (int i = 0; i < tableSize; i++) {
            System.out.print("Element number " + i +" :");
            table[i] = input.nextInt();
        }

        int choice;

        do {
            System.out.println("[*] Choose an action to perform.");
            System.out.println("[1] Finding the smallest number on the list.");
            System.out.println("[2] Finding the biggest number on the list.");
            System.out.println("[3] Order from smallest to biggest.");
            System.out.println("[4] Order from biggest to smallest.");
            System.out.println("[5] Delete an element from the table.");
            System.out.println("[6] Add an element to the table.");
            System.out.println("[7] Exit the program.");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                System.out.println("\033[2J");
                int smallestNum = table[0];
                for (int i = 1; i < table.length; i++) {
                    if(smallestNum > table[i])
                        smallestNum = table[i];
                }
                System.out.println("The smallest number is : " + smallestNum);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("\033[2J");
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Choose an existing action.");
            }
        } while (choice != 7);
    }
}
