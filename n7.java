// 7 - console that picks a random number from the list:  6,0,0,7,18,18,1,5
// Which numbers have the highest chance of being picked ? 
// How to force them to have all the same chance?
// How to make the numbers with high chances to be the lowest chance and vice-versa? (Without changing the structure of your table)

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;


public class n7 {
    public static void main(String[] args) {

        // Declare and Initialise the list
        int[] list = new int[] { 6, 0, 0, 7, 18, 18, 1, 5 };

        // 1 - The numbers have the highest chance of being picked are logically the one
        // that repeats the most so we use a hashmap

        HashMap<Integer, Integer> repetition = new HashMap<>();

        for (int i : list) {
        if (repetition.containsKey(i))
        repetition.replace(i, repetition.get(i) + 1);
        else
        repetition.put(i, 1);
        }

        System.out.print("The number(s) that repeats the most is(are) :");

        int highestChance = (Collections.max(repetition.values())); // find the highest repetition

        for (Entry<Integer, Integer> number : repetition.entrySet()) { // searches the elements with that repetition
        if (number.getValue() == highestChance)
        System.out.print(" " + number.getKey()); // Prints the elements
        }

        // 2 - To force them to all have the same chance we can

    }
}
