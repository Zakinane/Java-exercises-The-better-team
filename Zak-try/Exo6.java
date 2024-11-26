// 6 -  crypting messages :
// Message + int ---> |  console  |  ---> crypted message 
// Example: 
// I love java + 10 -> |  console  | ---> Svy�o}tk�k
// Where:
// S =(int) I + 10
// v = (int) v + 10
// And so on 

import java.util.Scanner;

public class Exo6 {
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
        StringBuilder sb = new StringBuilder(); // lets us concatenate chars
        for (int i = 0; i < message.length(); i++) {
            int cryptedInt = message.charAt(i) + value;
            char cryptedChar = (char) cryptedInt;
            sb.append(cryptedChar);
        }
        String cryptedMessage = sb.toString();
        System.out.println(cryptedMessage);
        
        input.close();
    }
}
