package collectionTest;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

public class StreamTest1 {
    public static void main(String args[]) {
        List<String> listOfCountry = new ArrayList<String>();

        List<List<String>> lst = new ArrayList<List<String>>();

        listOfCountry.add("India");
        listOfCountry.add("Singapore");
        listOfCountry.add("-1");
        listOfCountry.add("UK");
        listOfCountry.add("India");
        listOfCountry.add("-1");
        listOfCountry.add("USA");
        listOfCountry.add("Bharath");
        listOfCountry.add("Bharath");

        lst.add(listOfCountry);

        System.out.println("listOfCountry list: ");
        System.out.println("--------------------");
        lst.forEach(System.out :: println);

        System.out.println("\nlistOfCountry list without -1: ");
        System.out.println("-------------------------------");
        listOfCountry.stream().filter(n -> !n.equals("-1"))
                .forEach((n)-> System.out.print(n + " "));

        System.out.println("\n\nlistOfCountry list in lowercase: ");
        System.out.println("-----------------------------------");
        listOfCountry.stream().map(String :: toLowerCase)
                .forEach((n)-> System.out.print(n + " "));

//        List<Integer> integers = Arrays.asList(2,3,5,32,56,8,89,76,56,345,3,4,7,877,899);

        List<Integer> intLst = new ArrayList<Integer>();
        int[] intArray = {2,3,5,32,56,8,89,76,56,345,3,4,7,877,899};

        intLst = Arrays.stream(intArray).boxed().toList(); //java 16
        System.out.println("\n\nActual integer list: \n" + "------------------------\n "+ intLst);

        System.out.println("\nAverage of integer list: " + "\n-----------------\n" +
                Arrays.stream(intArray).average());

        Map<Boolean, List<Integer>> evenAndOdds = intLst.stream()
                 .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("\nOdd & Even num in list: " + "\n------------------------\n" + evenAndOdds);

        // Sum of even numbers
        int sumOfEvens = intLst.stream().filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("\nSum of Even num in list: " + sumOfEvens);

        //sorted order
        System.out.println("\nSorted ASC list: " + "\n-----------------");
        Arrays.stream(intArray).sorted().boxed().forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nSorted DESC list: " + "\n--------------------");
        Arrays.stream(intArray).boxed().sorted(Collections.reverseOrder())
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nMax in intArray: " + Arrays.stream(intArray).max());

        System.out.println("\nMin in intArray: " + Arrays.stream(intArray).min());

        System.out.println("\nGet unique numbers from list: "
                + "\n------------------------------");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        numbers.stream().map( i -> i*i).distinct().forEach(n-> System.out.print(n + " "));

        System.out.println("\n\nCount -1 occurrence in listOfCountry: "
                + "\n---------------------------------------\n"
                + listOfCountry.stream().filter(str -> str.equals("-1")).count());

        System.out.println("\nStream : " + "\n---------\n" +
                listOfCountry.stream().filter(string -> string.equals("-1")).count());
        System.out.println("\nParallel Stream : " +"\n------------------\n" +
                listOfCountry.parallelStream().filter(string -> !string.equals("-1")).count());
        System.out.println("\nlistOfCountry Stream : " +"\n------------------\n" +
                listOfCountry);

        System.out.println("\nParallel Stream 1 : " +"\n------------------\n" +
                listOfCountry.parallelStream().filter(string -> !string.equals("-1")).toList());


        String mergedString = listOfCountry.stream()
                .filter(string -> !string.equals("-1"))
                .collect(Collectors.joining(", "));
        System.out.println("\nMerged String: " + "\n---------------\n" + mergedString);

        System.out.println();
        // System.out.println("\nPattern match : " +  listOfCountry.stream().filter(s -> pattern.matcher(s).matches()).collect(Collectors.toList()));

    }
}