// 4 - console application to deal with tables ( find max value/ find min value / order table AtoZ & ZtoA / deleting element from table / adding element to the table...)....
// Alll based on the users input your console should decide which opération it should execute 

import java.util.ArrayList;
import java.util.Scanner;

public class n4 {

    // Just for styling purpose
    public static void cls() {
        System.out.println("\033[2J");
    }

    public static void main(String[] args) {

        // Declaration of the input variable
        Scanner input = new Scanner(System.in);

        // Declaration of the table
        ArrayList<Integer> table = new ArrayList<Integer>();

        int choice;

        do {
            System.out.println("[*] Choose an action to perform.");
            System.out.println("[0] Print the table.");
            System.out.println("[1] Add an element to the table.");
            System.out.println("[2] Delete an element from the table.");
            if (table.size() > 1) {
                System.out.println("[3] Finding the smallest number on the list.");
                System.out.println("[4] Finding the biggest number on the list.");
                System.out.println("[5] Order from smallest to biggest.");
                System.out.println("[6] Order from biggest to smallest.");
            }
            System.out.println("[7] Exit the program.");

            choice = input.nextInt();

            switch (choice) {

                case 0: // printing the table
                    cls();
                    System.out.print("Table : [");
                    for (int i = 0; i < table.size(); i++)
                        System.out.print(table.get(i) + ",");
                    if (table.isEmpty())
                        System.out.println("]\n");
                    else
                        System.out.println("\b]\n");
                    break;

                case 1: // Adding an element
                    cls();
                    System.out.print("Enter the number you want to add : ");
                    int addedNum = input.nextInt();
                    table.add(addedNum);
                    cls();
                    System.out.println(
                            table.get(table.size() - 1) + " successfully added at index " + (table.size() - 1) + "\n");
                    break;

                case 2: // Delete an element
                    cls();
                    System.out.print("Give the index of the element you want to remove : ");
                    int removedIndex = input.nextInt();
                    cls();
                    if (removedIndex >= 0 && removedIndex < table.size()) {
                        table.remove(removedIndex);
                        System.out.println("Element removed successfully.\n");
                    } else {
                        System.out.println("[!] Invalid index.\n");
                    }
                    break;

                case 3: // finding the smallest element
                    cls();
                    int smallestNum = table.get(0);
                    for (int i = 1; i < table.size(); i++) {
                        if (smallestNum > table.get(i))
                            smallestNum = table.get(i);
                    }
                    System.out.println("The smallest number is : " + smallestNum + "\n");

                    break;

                case 4: // finding the biggest element
                    cls();
                    int biggestNum = table.get(0);
                    for (int i = 1; i < table.size(); i++) {
                        if (biggestNum < table.get(i))
                            biggestNum = table.get(i);
                    }
                    System.out.println("The biggest number is : " + biggestNum + "\n");
                    break;

                case 5: // order AtoZ
                    cls();
                    table.sort(null);
                    System.out.println("Table successfully sorted.\n");

                    break;

                case 6: // order ZtoA
                    cls();
                    for (int i = 0; i < table.size(); i++) { // multiply by -1 the table
                        table.set(i, -table.get(i));
                    }
                    table.sort(null);   // sort the negative table
                    for (int i = 0; i < table.size(); i++) { 
                        table.set(i, -table.get(i));
                    }

                    System.out.println("Table successfully sorted.\n");
                    break;

                case 7: // Exit the program
                    cls();
                    System.out.print("Goodbye!");
                    break;

                default:
                    cls();
                    System.out.println("[!] Choose an existing action.\n");
            }
        } while (choice != 7);

        input.close();
    }
}
