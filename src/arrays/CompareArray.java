package arrays;

import java.util.Arrays;

public class CompareArray {
    public static void main(String[] args) {
        int[] s1={1,2,3,4,5,6};
        int[] s2={1,2,3,4,6,7};
        if (Arrays.equals(s1,s2) ) {
            System.out.println("the Arrays are the same");
        }
        else {
            System.out.println("Arrays are differents");
        }
    }
}
