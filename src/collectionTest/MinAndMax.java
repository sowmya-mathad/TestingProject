package collectionTest;
import java.util.*;
import java.lang.*;
public class MinAndMax {
    public static void main(String args[]) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(323);intList.add(2);intList.add(256);
        intList.add(34);intList.add(1);intList.add(56);

        System.out.println("Max: " + Collections.max(intList));
        System.out.println("Min: " + Collections.min(intList));
        Collections.reverse(intList);
        System.out.println("Reverse List: " + intList);
    }
}
