import java.util.Scanner;

/* General notes :
- there isn't any comments ( the comments are made to explain what's done and not how it is done )
- u should use methods here
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1pt -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should && vars without meaning
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL : 6.5 */
public class n6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter message: ");
        String msg = s.nextLine();
        System.out.print("Enter number: ");
        int n = s.nextInt();
        StringBuilder cMsg = new StringBuilder(); //listing to intelj proposition is a good thing but make sure to understand them first

        for (char ch : msg.toCharArray()) {
            cMsg.append((char) (ch + n));
        }

        System.out.println("Crypted message: " + cMsg);
        s.close();
    }
}

