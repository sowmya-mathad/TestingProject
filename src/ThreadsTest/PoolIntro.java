package ThreadsTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolIntro {
    public static void main(String[] args) {
        int numOfCpu = Runtime.getRuntime().availableProcessors();
        System.out.println("numOfCpu: " + numOfCpu);

        ExecutorService executorService = Executors.newFixedThreadPool(numOfCpu);

        for(int i=0 ;i <= 20; i++) {
            executorService.execute(() -> System.out.println(Thread.currentThread().getName()));
        }
        System.out.println(Thread.currentThread().getName());
        executorService.shutdown();
    }
}
