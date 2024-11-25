// 5 - console app that gets the current system time and print  ...
// Good morning-> if it's 3am to 12pm
// Good afternoon-> "" 12pm to 4pm
// Good evening-> "" 4pm to 9pm
// Good night-> "" 9pm to 3 am
import java.time.LocalTime;

public class Exo5 {
    public static void main(String[] args) {

        // Get the current hour
        int time = LocalTime.now().getHour();

        // Print the appropriate message
        if(time >= 21 || time <=3)
            System.out.println("Good night.");
        else if(time >= 16)
            System.out.println("Good evening.");
        else if(time >= 12)
            System.out.println("Good afternoon.");
        else if(time >= 3)
            System.out.println("Good morning.");

        // fun addition
        BufferedReader br = new BufferedReader(new FileReader("./Exo5stuff.txt"));

        Boolean clockMode = true;
        if(clockMode == true){
            String line;
            
            
        }

    }
}
