
// 5 - console app that gets the current system time and print  ...
// Good morning-> if it's 3am to 12pm
// Good afternoon-> "" 12pm to 4pm
// Good evening-> "" 4pm to 9pm
// Good night-> "" 9pm to 3 am
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;

public class Exo5 {
    public static void main(String[] args) {

        // Get the current hour
        int time = LocalTime.now().getHour();

        // Print the appropriate message
        if (time >= 21 || time <= 3)
            System.out.println("Good night.");
        else if (time >= 16)
            System.out.println("Good evening.");
        else if (time >= 12)
            System.out.println("Good afternoon.");
        else if (time >= 3)
            System.out.println("Good morning.");

        // fun addition
        Boolean clockMode = true;

        try {
            FileReader fr = new FileReader("Exo5stuff.txt");
            BufferedReader br = new BufferedReader(fr);

            if (clockMode == true) {

                String line;
                int lineStart = time * 6 - 11;
                int numLine = 0;

                while ((line = br.readLine()) != null) {
                    numLine++;
                    if (numLine == lineStart) {
                        for (int i = 0; i < 12; i++) {
                            System.out.println(line);
                            line = br.readLine();
                        }
                        break;
                    }
                }

            }
        } catch (IOException e) {

        }

    }
}
