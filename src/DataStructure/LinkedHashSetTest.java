package DataStructure;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("sowmya");
        hashSet.add("Girish");
        hashSet.add("Bethleny");
        hashSet.add("Shreyansh");
        hashSet.add("James");
        hashSet.add("Girish");

        hashSet.forEach(s -> System.out.print(s + ","));
    }
}
