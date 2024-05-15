package DataStructure;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("sowmya");
        hashSet.add("Girish");
        hashSet.add("Bethleny");
        hashSet.add("Shreyansh");
        hashSet.add("James");
        hashSet.add("Girish");

        hashSet.forEach(s -> System.out.println(s));
    }
}
