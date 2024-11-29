import java.util.Scanner;
public class exo1{
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name;
        name=in.nextLine();
        System.out.println("Hello "+name);
        in.close();
    }
}
