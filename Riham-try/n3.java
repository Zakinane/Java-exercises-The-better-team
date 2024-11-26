package devUp;
import java.util.*;

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
