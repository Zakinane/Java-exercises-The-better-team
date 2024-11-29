import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter message: ");
        String msg = s.nextLine();
        System.out.print("Enter number: ");
        int n = s.nextInt();
        StringBuilder cMsg = new StringBuilder();

        for (char ch : msg.toCharArray()) {
            cMsg.append((char) (ch + n));
        }

        System.out.println("Crypted message: " + cMsg);
        s.close();
    }
}

