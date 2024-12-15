package devUp;
import java.util.*;


/* General notes :
-  the comments are made to explain what's done and not how it is done
- u should use methods here
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1 pt   -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL :  6.5 */
public class n3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Entrer the size of your matrix");
		n=s.nextInt();
		int[][] M = new int[n][n];
		int[][] R = new int[n][n];
		System.out.println("Entrer the elemnts of your matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("M["+i+"]["+j+"]:");
				M[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				R[i][j]=0;
				for(int k=0;k<n;k++) {
					R[i][j]=R[i][j]+M[i][k]*M[k][j];
				}
			}
		}
		System.out.println("your squared matrix :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(R[i][j]+" ");
				
			}
			System.out.print("\n");
		}
		s.close();
		

	}

}
