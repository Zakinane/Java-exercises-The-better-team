import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean repeat;
                do {
                    System.out.println("Enter the first number:");
                    float fn = in.nextFloat();
                    System.out.println("Enter the second number:");
                    float sn = in.nextFloat();
                    byte opperation;
                    System.out.println("Choose what opperation u want:");
                    System.out.println("1-(+)\n2-(-)\n3-(*)\n4-(/)\n5-(^)");
                    opperation = in.nextByte();
                    switch (opperation) {
                        case 1:
                            System.out.println(fn + " + " + sn + " = " + (fn + sn));
                            break;
                        case 2:
                            System.out.println(fn + " - " + sn + " = " + (fn - sn));
                            break;
                        case 3:
                            System.out.println(fn + " * " + sn + " = " + (fn * sn));
                            break;
                        case 4:
                            System.out.println(fn + " / " + sn + " = " + (fn / sn));
                            break;
                        case 5:
                        System.out.println(fn+" ^ "+sn+" = "+Math.pow(fn,sn));
                        break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                        System.out.println("Do you want to repeat?\n-Enter(false)for NO\n-Enter(true)for Yes");
                        repeat = in.nextBoolean();
                } while (repeat);
        in.close();
    }

}
