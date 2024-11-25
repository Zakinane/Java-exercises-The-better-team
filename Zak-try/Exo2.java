// 2 - write a console app that takes two numbers and apply +, /,*,^,- ....
// based on the users target opération

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        // Declaration of the input variable
        Scanner input = new Scanner(System.in);

        // Getting the two numbers
        System.out.print("Enter the first two numbers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Getting the operation type
        System.out.print("Chose the operation (+, -, /, *, ^) : ");
        char operation = input.next().charAt(0);

        // Choosing what to print depending on the operation
        switch (operation) {
            // addition
            case '+':
                System.out.print("The result is : " + (number1 + number2));
                break;
            // Substraction
            case '-':
                System.out.print("The result is : " + (number1 - number2));
                break;
            // Division
            case '/':
                if (number2 == 0)
                    System.out.print("The result is : ∞");
                else
                    System.out.print("The result is : " + (double) number1 / number2);
                break;
            // Multiplication
            case '*':
                System.out.print("The result is : " + (number1 * number2));
                break;
            // Power
            case '^':
                System.out.print("The result is : " + (int) Math.pow(number1, number2));
                break;
            default:
                System.out.println("Incorrect operation symbol.");
        }
    }

}
