package Misc;

import java.util.stream.IntStream;

public class FactorialJava8 {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++)
            fact = fact * i;
        System.out.println("Using for Loop: " + fact);
        System.out.println("Factorial using Recursion: " + factorialRecursive(num));
        System.out.println("Factorial using streams: " + factorialStream(num));
    }

    public static int factorialRecursive(int num) {
        return num == 1 ? 1 : num * factorialRecursive(num - 1);
    }

    public static int factorialStream(int num) {
        return IntStream.rangeClosed(1, num)
                .reduce(1, (int a, int b) -> a * b);
    }
}
