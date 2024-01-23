package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Integer[] numbers = readIntegers();

        findMin(numbers);

    }

    private static Integer[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            String input = scanner.nextLine();

            try {
                numbers[i] = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                i--;  // Decrement i to re-enter the current index
            }
        }

        System.out.println("Numbers entered: " + Arrays.toString(numbers));


        scanner.close();

        return numbers;
    }

    private static int findMin(Integer[] array) {
              int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }


        System.out.println("Minimum value: " + min);

        return min;
    }
}