// 3 - write a console app that takes a matrix as input (of size N*N) and print it square 
// ( ie : putting M is matrix the expected out put is : M*M )   

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {

        // Declaration of the input variable
        Scanner input = new Scanner(System.in);

        // Getting the size
        System.out.print("Enter the size of the square matrix : ");
        int N = input.nextInt();

        // Declaration of the matrix
        int[][] matrix = new int[N][N];

        // Filling up the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("Give the element [%d][%d] : ", i + 1, j + 1);
                matrix[i][j] = input.nextInt();
            }
        }

        // Calculate the each squared matrix element + printing
        System.out.println("The square of the matrix is :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int sum = 0;
                for (int k = 0; k < N; k++) {
                    sum += matrix[i][k] * matrix[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        input.close();

    }
}
