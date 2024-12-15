import java.util.Scanner;



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

public class exo3 {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);   
    System.out.println("Enter the size of the matrix:");
    byte N=in.nextByte();
    int matrix[][]=new int[N][N]; // C syntax !!!
    int square[][]=new int[N][N]; // C syntax !!!
    for (byte i = 0; i < square.length; i++) {
        for (int j = 0; j < square.length; j++) {
            System.out.print("["+(i+1)+"]"+"["+(j+1)+"]: ");
            matrix[i][j]=in.nextInt();
        }
    }

    for (int i = 0; i < square.length; i++) {
        for (int j = 0; j < square.length; j++) {
            square[i][j]=0;
            for (int k = 0; k < square.length; k++) {
            square[i][j]+=matrix[i][k]*matrix[k][j];
                
            }
        }
    }
    System.out.println("The square of the matrix:");
    for (int i = 0; i < square.length; i++) {
        for (int j = 0; j < square.length; j++) {
           System.out.print(square[i][j]+" ");
        }
        System.out.println("");
    }
    in.close();
}
}
