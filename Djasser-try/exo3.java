import java.util.Scanner;
public class exo3 {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);   
    System.out.println("Enter the size of the matrix:");
    byte N=in.nextByte();
    int matrix[][]=new int[N][N];
    int square[][]=new int[N][N];
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
