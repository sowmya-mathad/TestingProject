package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MphasisTest {
    public static void main(String[] args) {
        String[] str = {"pack", "track", "jack", "mack", "sacck", "rack"};

        String[] afterFilter = Arrays.stream(str)
                .filter(name -> !name.equals("jack"))
                .toList().toArray(new String[0]);


        List<String> strList = Arrays.stream(afterFilter).toList();
//        strList.removeFirst();

        // removeIf(s->s.equals("jack"));
        strList.forEach(System.out::println);

        List<String> strList1 =
                new ArrayList<>(
                        List.of("jack", "sowmya", "shreyansh", "giri")
                );

        strList1.add("jack");
//        String[] afterFilter1 = strList1.stream()
//                .filter(name -> name.equals("jack"))
//                .collect(Collectors.toList()).toArray(new String[0]);

        System.out.println("Count: " + strList1.stream().filter(name -> !name.equals("jack")).count());
        System.out.println("FindAny: " + strList1.stream().filter(name -> !name.equals("jack")).count());


    }
}
