package devUp;
import java.util.*;

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

public class n1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username;
		System.out.println("Please, enter your name");
		username = s.nextLine();
		System.out.println("hello "+username+"!");
		s.close();

	}

}
