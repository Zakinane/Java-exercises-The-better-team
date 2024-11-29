// 7 - console that picks a random number from the list:  6,0,0,7,18,18,1,5
// Which numbers have the highest chance of being picked ? 
// How to force them to have all the same chance?
// How to make the numbers with high chances to be the lowest chance and vice-versa? (Without changing the structure of your table)

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class n7 {
    public static void main(String[] args) {

        // Declare and Initialise the list + random
        int[] list = new int[] { 6, 0, 0, 7, 18, 18, 1, 5 };
        Random random = new Random();

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
        // Create a unique list
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : list) {
            uniqueNumbers.add(num);
        }

        // Convert unique numbers to an array
        Integer[] uniqueArray = uniqueNumbers.toArray(new Integer[0]);

        // Pick a random number with equal chance
        int randomPick = uniqueArray[random.nextInt(uniqueArray.length)];
        System.out.println("\nRandomly picked number with equal chance: " + randomPick);

        // 3- How to make the numbers with high chances to be the lowest chance and
        // vice-versa?
        // (Without changing the structure of your table)

        // Count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create an array where numbers are repeated inversely to their frequency
        int[] invertedNumbers = new int[list.length];
        int index = 0;

        // Fill the array with numbers, less frequent ones will appear more
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            for (int i = 0; i < list.length / frequency; i++) {
                invertedNumbers[i++] = entry.getKey();
            }
        }

        // Pick randomly from the inverted numbers
        int randomPickNew = invertedNumbers[random.nextInt(invertedNumbers.length)];
        System.out.println("Randomly picked number with inverted chance: " + randomPickNew);

    }
}
