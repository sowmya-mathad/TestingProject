package Misc;

import java.util.stream.Stream;

/**
 * Generate Fibonacci series
 *
 */

public class FebonacciSeriesJava8 {
    public static void main(String[] args) {
        System.out.print("using java 8 :");
        Stream.iterate(new int[]{0,1},
                fib -> new int[] { fib[1], fib[0]+fib[1] })
                .limit(10)
                .map(n -> n[0])
                .forEach(fibNum -> System.out.print(fibNum + ","));

        System.out.print("\n Using for loop: ");
        int first = 0, second = 1;
        int limit =10;
        for(int i=0;i<limit;i++){
            System.out.print(first + ",");
           int sum = first + second;
           first= second;
           second = sum;
        }
    }
}

