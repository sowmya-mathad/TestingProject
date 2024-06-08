package ThreadsTest;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        Integer noOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println(noOfCores);
        ExecutorService e = Executors.newFixedThreadPool(5);
        Callable<Integer> callable = () -> 1;
        Future<Integer>future = e.submit(callable);
        try {
            System.out.println(future.get());
            e.shutdown();
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        } catch(ExecutionException ex) {
            ex.printStackTrace();
        }

    }
}
