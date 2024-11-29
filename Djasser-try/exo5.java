/*5 - console app that gets the current system time and print  ...
Good morning-> if it's 3am to 12pm
Good afternoon-> "" 12pm to 4pm
Good evening-> "" 4pm to 9pm
Good night-> "" 9pm to 3 am*/
import java.time.LocalTime;
public class exo5 {
    public static void main(String[] args) {
        LocalTime cTime=LocalTime.now();
        int hour=cTime.getHour();
        if (hour>3 && hour<12) {
            System.out.println("Good morning");
        }else if (hour>12 && hour<16) {
            System.out.println("Good afternoon");
        }else if (hour>16 && hour<21) {
            System.out.println("Good evening");
        }else if (hour>21 || hour<3) {
            System.out.println("Good night");
        }

    }

}
