package collectionTest;

import java.security.SecureRandom;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class RandomTestInt {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream intRandom = random.ints(10, 0 , 100);
        intRandom.boxed().distinct().sorted().forEach(x-> System.out.println(x));

        DoubleStream doubles = random.doubles(10,0.5,0.85 );
        System.out.println(doubles.map(v ->v ).max().orElseThrow(NoSuchElementException::new));

        SecureRandom secureRandom = new SecureRandom();
        IntStream intStreams = secureRandom.ints(10, 0,1000);
        System.out.println("secure random num check even:");
        intStreams.boxed().filter(i->i%2==0).toList().forEach(i-> System.out.println(i));
    }
}
