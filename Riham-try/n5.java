import java.time.LocalTime;
import java.util.Scanner;


/* General notes :
- it's funny the inf greeting loop
*/

/** Evaluation :
 * 1pt -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL :  6.5 */
public class n5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Get Greeting");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    int h = LocalTime.now().getHour();
                    if (h >= 3 && h < 12) {
                        System.out.println("Good morning");
                    } else if (h >= 12 && h < 16) {
                        System.out.println("Good afternoon");
                    } else if (h >= 16 && h < 21) {
                        System.out.println("Good evening");
                    } else {
                        System.out.println("Good night");
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

