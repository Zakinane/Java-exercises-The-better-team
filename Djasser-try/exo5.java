/*5 - console app that gets the current system time and print  ...
Good morning-> if it's 3am to 12pm
Good afternoon-> "" 12pm to 4pm
Good evening-> "" 4pm to 9pm
Good night-> "" 9pm to 3 am*/
import java.time.LocalTime;

/* General notes :
-  the comments are made to explain what's done and not how it is done
*/

/** Evaluation :
 * 1pt -> for the solution
 * 0.5 pt -> for the clean code principles //The reason for why u won't get full point (1pt): for not using methods when u should
 * 2.5 pt -> space optimization
 * 2.5 pt -> speed optimization
 * TOTAL :  6.5 */
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
