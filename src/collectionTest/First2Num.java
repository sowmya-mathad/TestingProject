package collectionTest;

import java.util.*;
import java.util.stream.Collectors;

public class First2Num {
    public static void main(String[] args) {
        //int[] intArray = {1,10,7,8,9,6,11,5,4,10,2,17,18,19};
        List<Integer> lst = new ArrayList<Integer>();
        List<Integer> newLst = Arrays.stream(new int[] {1,10,7,8,9,6,11,5,4,10,2,17,18,19}).sorted().boxed().filter(n -> n > 10).toList();
        System.out.println("Numbers greater than 10 from the list: ");
        newLst.forEach(System.out :: println);
        System.out.println("first 2 numbers :" + newLst.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .limit(2).toList());
        for( int i = 0; i<2; i++)
                System.out.println(newLst.get(i));

        List<Integer> nums = Arrays.asList(1,1,1,1);
        int res = nums.stream()
                .filter(n->n%2==0)
                .reduce(10,(a, b) -> a+b);
        System.out.println("Res: " + res);
    }
}
