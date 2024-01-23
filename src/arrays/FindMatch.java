package arrays;

import java.util.Arrays;

public class FindMatch {
    public static void main(String[] args) {
        String[] sArray = {"Elodie","Elisa", "Monncake","Joe", "Mark"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"Elodie") >=0) {
            System.out.println("found Elodie in the list");
        }
        else System.out.println("Elodie was not found in the list");
    }
}
