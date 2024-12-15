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
public class exo6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the message you wanna crypt:");
        String message=in.nextLine();
        System.out.println("Enter the number:");
        int number=in.nextInt();
        for (int i = 0; i < message.length(); i++) {
            char crypt=(char)((int) message.charAt(i) +number);
            System.out.print(crypt);
        }
        in.close();
    }

}
