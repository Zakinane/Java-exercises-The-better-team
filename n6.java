// 6 -  crypting messages :
// Message + int ---> |  console  |  ---> crypted message 
// Example: 
// I love java + 10 -> |  console  | ---> Svy�o}tk�k
// Where:
// S =(int) I + 10
// v = (int) v + 10
// And so on 

import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {

        // Declaration of the input variable
        Scanner input = new Scanner(System.in);

        // Getting the message
        System.out.print("Enter the message you want to crypt : ");
        String message = input.nextLine();

        // Getting the value
        System.out.print("Enter the crypting value : ");
        int value = input.nextInt();

        // Crypting
        StringBuilder cryptedMessage = new StringBuilder(message.length()); // used to concat chars
        for (char c : message.toCharArray()) {
            cryptedMessage.append((char) (c + value));
        }

        // Printing the message
        System.out.println("Crypted message: " + cryptedMessage);
        
        input.close();
    }
}
