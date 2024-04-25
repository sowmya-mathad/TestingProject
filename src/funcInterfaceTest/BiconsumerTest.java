package funcInterfaceTest;


import java.util.function.BiConsumer;
import java.util.*;

public class BiconsumerTest {
    public static void main(String[] arg) {
        BiConsumer<String,Integer> biconsumer1 = BiconsumerTest:: ShowDetails;
        biconsumer1.accept("Shreyansh", 7);
        biconsumer1.accept("Sowmya", 41);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Shreyansh");
        map1.put(2, "Julian");
        map1.put(3, "Alex");
        map1.put(4, "Noha");

        BiConsumer<Map<Integer, String>, String> BiConsumer2 = BiconsumerTest:: ShowDetailsFormMap;
        BiConsumer2.accept(map1, "Student");

    }
    static void ShowDetails(String name, Integer age) {
        System.out.println(name + " " + age);
    }
    static void ShowDetailsFormMap(Map<Integer, String> map1,  String mapName) {
        System.out.println("-------------" + mapName + " Map -------------");
        map1.forEach((key, value) -> System.out.println(key + " " + value));
    }
}