package Misc;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 10 factorial num using java 8
 */

public class OddEvenJava8 {
    public static void main(String[] args) {
        IntStream ints = IntStream.range(1,50);
        System.out.println("Even Numbers:");
        ints.filter(n->(n%2==0))
                .forEach(even -> System.out.print(even + ","));

        IntStream ints1 = IntStream.range(1,50);
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        ints1.forEach(n -> {
            if(n % 2 ==0)
                evenNumbers.add(n);
            else
                oddNumbers.add(n);
        });
        System.out.println(oddNumbers + " and " + evenNumbers);
    }
}
