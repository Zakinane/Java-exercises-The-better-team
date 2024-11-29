// 2 - write a console app that takes two numbers and apply +, /,*,^,- ....
// based on the users target opération

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {

        // Declaration of the input variable
        Scanner input = new Scanner(System.in);

        // Get the two numbers from the user
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Get the operation type
        System.out.print("Choose the operation (+, -, /, *, ^): ");
        char operation = input.next().charAt(0);

        // Perform the calculation based on the operation
        double result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Error: Division by zero is undefined.");
                    return;
                }
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '^':
                result = Math.pow(number1, number2);
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }
        
        // Display the results
        System.out.println("The result is: " + result);

        input.close();

    }
}
