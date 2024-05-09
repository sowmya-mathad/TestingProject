import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHMTest {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, 30);
        hashMap.put(4, 40);
        hashMap.put(5, 50);
        hashMap.put(6, 60);

        Iterator<Integer> itr = hashMap.keySet().iterator();
        while(itr.hasNext()) {
            Integer i = itr.next();
            System.out.println(hashMap.get(i));
            if(i == 5) {
                hashMap.put(7,67);
            }
        }
    }
}
