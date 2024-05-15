package DataStructure;


import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(11, "sowmya");
        treeMap.put(2, "Girish");
        treeMap.put(23, "Bethleny");
        treeMap.put(4, "Shreyansh");
        treeMap.put(65, "James");
        treeMap.put(778, "Shreyansh");

        System.out.println(treeMap);
    }
}
