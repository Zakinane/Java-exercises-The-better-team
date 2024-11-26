package devUp;
import java.util.*;

public class n2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n1,n2;
		String op;
		double r ;
		System.out.println("Enter your first number!");
		n1 = s.nextDouble();
		System.out.println("Enter your second number!");
		n2 = s.nextDouble();
		System.out.println("what operation do you wish to perform?");
		op = s.next();
		switch(op)
		{
		case "+":
			r=n1+n2;
			break;
		case "-":
			r=n1*n2;
			break;
		case "*":
			r=n1*n2;
			break;
		case "/":
			if(n2!=0) {
				r=n1/n2;
			}
			else {
				System.out.println("error");
				return;
			}
			break;
		case "^":
			r=Math.pow(n1, n2);
			break;
		default:
			System.out.println("the operation u entered is not valid");
		    return;
		}
		System.out.println("your answer is: "+r);
		s.close();
		
	}

}
