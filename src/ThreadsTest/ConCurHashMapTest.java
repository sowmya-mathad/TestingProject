package ThreadsTest;

import org.junit.Test;

import java.util.*;

public class ConCurHashMapTest {
    //    public static void main(String[] args) {
//        //
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "baeldung");
//        map.put(2, "HashMap");
//        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
//        Iterator<Map.Entry<Integer, String>> iterator = synchronizedMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            synchronizedMap.put(3, "Modification");
//            iterator.next();
//        }
    @Test(expected = ConcurrentModificationException.class)
    public void whenRemoveAndAddOnHashMap_thenConcurrentModificationError() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "baeldung");
        map.put(2, "HashMap");
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        for (Map.Entry<Integer, String> integerStringEntry : synchronizedMap.entrySet()) {
            synchronizedMap.put(3, "Modification");
        }
    }

    @Test(expected = ConcurrentModificationException.class)
    public void whenRemoveAndAddOnHashMap_thenNoConcurrentModificationError() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "baeldung");
        map.put(2, "HashMap");
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        Iterator<Map.Entry<Integer, String>> iterator = synchronizedMap.entrySet().iterator();
        while (iterator.hasNext()) {
            synchronizedMap.put(3, "Modification");
            iterator.next();
        }
    }
}
