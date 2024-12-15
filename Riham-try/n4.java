package devUp;
import java.util.Scanner;

/* General notes :
- u should use methods here
- avoid having nested loops or loops with if-else/switch inside
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1 pt   -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should && vars without meaning
 * 0.5 pt -> for checking whether the array is empty or not
 * 1 pt -> space optimization //The reason for why u won't get full point (2.5pt): for using strings instead of int
 * 1 pt -> speed optimization //The reason for why u won't get full point (2.5pt): for using a lot of print() calls when u could use one / and other notes bellow
 * TOTAL : 4 */
public class n4 {
    public static void main(String[] args) {
        String[] t = new String[100];// Array of strings ?? && of size 100 ?? why is that ??
        int sz = 0;
        Scanner s = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Find Max");
            System.out.println("2. Find Min");
            System.out.println("3. Sort A-Z");
            System.out.println("4. Sort Z-A");
            System.out.println("5. Add Element");
            System.out.println("6. Delete Element");
            System.out.println("7. Show Table");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            ch = s.nextInt();
            s.nextLine(); // why is this ??

            switch (ch) {
                case 1:
                    if (sz == 0) {
                        System.out.println("Table is empty."); //GOOD
                    }
                    else {
                        String max = t[0];
                        for (int i = 1; i < sz; i++) {
                            if (t[i].compareTo(max) > 0) { //Solution generic good!
                                max = t[i];
                            }
                        }
                        System.out.println("Max: " + max);
                    }
                    break;
                case 2:
                    if (sz == 0) {
                        System.out.println("Table is empty.");
                    }
                    else {
                        String min = t[0];
                        for (int i = 1; i < sz; i++) {
                            if (t[i].compareTo(min) < 0) {
                                min = t[i];
                            }
                        }
                        System.out.println("Min: " + min);
                    }
                    break;
                case 3:
                    for (int i = 0; i < sz - 1; i++) {
                        for (int j = i + 1; j < sz; j++) {
                            if (t[i].compareTo(t[j]) > 0) {
                                String tmp = t[i];
                                t[i] = t[j];
                                t[j] = tmp;
                            }
                        }
                    }
                    System.out.println("Sorted A-Z.");
                    break;
                case 4:
                    for (int i = 0; i < sz - 1; i++) {
                        for (int j = i + 1; j < sz; j++) {
                            if (t[i].compareTo(t[j]) < 0) {
                                String tmp = t[i];
                                t[i] = t[j];
                                t[j] = tmp;
                            }
                        }
                    }
                    System.out.println("Sorted Z-A.");
                    break;
                case 5:
                    if (sz >= t.length) {
                        System.out.println("Table is full.");
                    }
                    else {
                        System.out.print("Enter element to add: ");
                        t[sz++] = s.nextLine(); // what if the user inputted 100 numbers already how to do that ?
                        System.out.println("Added.");
                    }
                    break;
                case 6:
                    if (sz == 0) {
                        System.out.println("Table is empty.");
                    }
                    else {
                        System.out.print("Enter element to delete: ");
                        String del = s.nextLine();
                        boolean f = false; // i liked the idea of this flag
                        for (int i = 0; i < sz; i++) {
                            if (t[i].equals(del)) {
                                for (int j = i; j < sz - 1; j++) {
                                    t[j] = t[j + 1]; // since the array has lot of elements -in case user input 3 elements - the loop will be running 97 time without any reason !!
                                }
                                sz--;
                                f = true;
                                System.out.println("Deleted.");
                                break;
                            }
                        }
                        if (!f) {
                            System.out.println("Element not found.");
                        }
                    }
                    break;
                case 7:
                    if (sz == 0) {
                        System.out.println("Table is empty.");
                    } else {
                        System.out.print("Table: ");
                        for (int i = 0; i < sz; i++) {
                            System.out.print(t[i] + (i < sz - 1 ? ", " : "")); // i never saw someone that used this condition while printing the elements of the array (it's elegant but yet not optimal)
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (ch != 0);

        s.close();
    }
}
