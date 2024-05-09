package ThreadsTest;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class concurrentHMtest {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> bookAndPrice = new ConcurrentHashMap<>();
        bookAndPrice.put("Effective Java", 42);
        Integer price = bookAndPrice.get("Effective Java"); //return 42;
        System.out.println(bookAndPrice);
        System.out.println("Size: " + bookAndPrice.size());
        bookAndPrice.replace("Effective Java", 42, 28);
        Set<String> books = bookAndPrice.keySet();

//        Integer price2 = bookAndPrice.get("Head First Java");

    }
}
