import java.util.Scanner;

/* General notes :
- u should use methods here
- the scanner.close() :: should be used after the input has been scanned not in the end of programme
*/

/** Evaluation :
 * 1 pt   -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should && vars without meaning
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL : 6.5 */

public class exo4 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    byte size=in.nextByte();
    int array[]=new int[size]; // C syntax !!!
    for (int i = 0; i < array.length; i++) {
        System.out.print("Enter the "+(i+1)+" value: ");
        array[i]=in.nextInt();
    }
    System.out.println("\n1-Max value\n2-Min value\n3-Ascending sorting\n4-Disending sorting\nChoose from 1 to 4:");
    byte choice=in.nextByte();
    switch (choice) {
        case 1:
        int max=array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i]>max) {
                    max=array[i];
                }
            }
            System.out.println("The max value in the array is "+max);
            break;
        case 2:
        int min=array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i]<min) {
                    min=array[i];
                }
            }
            System.out.println("The min value in the array is "+min);
            break;
        case 3:
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i]>array[j]) {
                    tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
        System.out.print("The new array: { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }System.out.println("}");
        break;

        case 4:
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i]<array[j]) {
                    tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
        System.out.print("The new array: { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }System.out.println("}");
        break;

    
        default:
        System.out.println("Invalid input");
            break;
    }
    in.close();
}
}
