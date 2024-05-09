package collectionTest;

import java.util.stream.IntStream;

public class ParallelStrmTest {
    public static void main(String[] args) {
        final int TIMES = 10;
        for(int i= 0;i< TIMES;i++) {
            var before = System.currentTimeMillis();
            IntStream.range(1, 100).parallel().sum();
            System.out.println(System.currentTimeMillis() - before);
        }
    }
}
