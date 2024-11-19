package collectionTest;

import java.util.ArrayList;

public class GFG {
    public static void main(String[] arg) {

        // creating an empty ArrayList with an initial
        // capacity of 5
        ArrayList<String> flower = new ArrayList<String>(5);

        // using add() method to add elements in the
        // ArrayList flower
        flower.add("red-rose");
        flower.add("tulip");
        flower.add("sun-flower");
        flower.add("marie-gold");
        flower.add("orchid");

        // printing the size of the ArrayList flower
        System.out.println("Size of list: "
                + flower.size());

        // printing the ArrayList flower
        System.out.println("Flower ArrayList = " + flower);

        // Removing element at 3rd position from ArrayList
        // flower
        System.out.println(
                "Removing element at index = 2 ");
        flower.remove(2);

        System.out.println("After removing element");

        // printing the size of the ArrayList flower
        System.out.println("Size of list: "
                + flower.size());

        // printing the ArrayList flower
        System.out.println("Flower ArrayList = " + flower);
    }
}