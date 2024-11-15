package Misc;


/**
 * How to find pairs in an array whose sum is equal to the given number?
 * <p>
 * Example - if the given array is (2,6,3,9,11) and the given number is 9, output would be (6,3)
 */

public class Prgm4 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 9, 11};
        int given = 9;
        int num1;
        for (int i = 0; i < arr.length; i++) {
            num1 = arr[i];
            for (int j = i; j < arr.length; j++) {
                int sum = num1 + arr[j];
                if (sum == given)
                    System.out.println("(" + num1 + "," + arr[j] + ")");

            }
        }
    }
}
