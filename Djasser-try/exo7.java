import java.util.Random;

public class exo7 {
    public static void main(String[] args) {
        int[] list = {6, 0, 0, 7, 18, 18, 1, 5};
        Random rand = new Random();

        int randomIndex = rand.nextInt(list.length);
        System.out.println("Random number picked: " + list[randomIndex]);
    }
}
