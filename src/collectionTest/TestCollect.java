package collectionTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollect {
    public static void main(String args[]) {
        List<Integer> intList = Arrays.asList(12,45,67,78,889,343,22,56,76,78,98,23,5,8,8);
        List<Integer> oddLst = intList.stream().filter(num -> num%2 != 0).collect(Collectors.toList());
        List<Integer> evenList = intList.stream().filter(num -> num%2 == 0).collect(Collectors.toList());

    }
}
