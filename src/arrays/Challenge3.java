package arrays;

import java.util.Arrays;

public class Challenge3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array before reversal: " + Arrays.toString(array));

        reverse(array);

        System.out.println("Array after reversal: " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the center of the array
            start++;
            end--;
        }
    }
}
