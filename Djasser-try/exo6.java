import java.util.Scanner;
public class exo6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the message you wanna crypt:");
        String message=in.nextLine();
        System.out.println("Enter the number:");
        int number=in.nextInt();
        for (int i = 0; i < message.length(); i++) {
            char crypt=(char)((int) message.charAt(i) +number);
            System.out.print(crypt);
        }
        in.close();
    }

}
