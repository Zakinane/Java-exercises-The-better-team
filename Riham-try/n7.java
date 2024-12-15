
import java.util.Random;
import java.util.Scanner;

/** Evaluation :
 * 0pt -> for the solution // not the required answer
 * TOTAL : 0 */
public class n7 {
    public static void main(String[] args) {
        int[] n = {6, 0, 0, 7, 18, 18, 1, 5};
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int ch;

        do {
            System.out.println("\n1. Pick a number");
            System.out.println("2. Which numbers are most likely?");
            System.out.println("3. Make all numbers equally likely");
            System.out.println("4. Flip probabilities");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Random number: " + n[r.nextInt(n.length)]);
                    break;
                case 2:
                    System.out.println("Numbers that appear more often (0, 18) are chosen more frequently.");
                    break;
                case 3:
                    int[] eq = {6, 0, 7, 18, 1, 5};
                    System.out.println("Number with equal chance: " + eq[r.nextInt(eq.length)]);
                    break;
                case 4:
                    int[] inv = {6, 7, 1, 5, 0, 0, 18, 18};
                    System.out.println("Number with flipped odds: " + inv[r.nextInt(inv.length)]);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (ch != 0);

        s.close();
    }
}
