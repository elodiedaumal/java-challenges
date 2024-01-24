package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Challenge1 {
    public static void main(String[] args) {
        // Specify the size of the array
        int arraySize = 5;

        // Create an array of random integers
        Integer[] randomArray = generateRandomArray(arraySize);

        // Create a Random object

        System.out.println(Arrays.toString(randomArray));
        Integer[] sortedRandomArray = sortArrayDescending(randomArray);

        System.out.println(Arrays.toString(sortedRandomArray));
    }

    private static Integer[] generateRandomArray(int size) {
        Integer[] array = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(); // Generates a random integer between 0 and 99
        }

        return array;
    }

    private static Integer[] sortArrayDescending(Integer[] array) {
        Integer[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray, Collections.reverseOrder());
        return sortedArray;
    }
}
