import java.util.Scanner;

/* General notes :
-  the comments are made to explain what's done and not how it is done
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1 pt   -> for the solution
 * 1 pt   -> for the clean code principles
 * 1.5 pt -> for creativity and using scanner.close() method
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL : 8.5 */
public class exo1{
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name;
        name=in.nextLine();
        System.out.println("Hello "+name);
        in.close();
    }
}
