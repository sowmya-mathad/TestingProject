package ThreadsTest;

import org.junit.Test;

import java.util.*;

public class ArraListConCurExp {
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

    @Test (expected = ConcurrentModificationException.class)
    public void arrayListModifyTestUsingItr() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals(3))
                list.remove(value);
        }
    }

    @Test
    public void arrayListModifyTestUsingFor() {
        List lst = new ArrayList<>();
        //.add(10); lst.add(4); lst.add(6); lst.add(40); lst.add(64);
        lst = Arrays.asList(4,6,8,9,9);
        for(int i=0;i<lst.size();i++) {
               // int x = (int) lst.get(i);
            System.out.println(lst.get(i));
            lst.remove(i);
        }

    }

}
