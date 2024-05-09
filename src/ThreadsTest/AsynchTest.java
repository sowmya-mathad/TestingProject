package ThreadsTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsynchTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //ExecutorService threadPool = Executors.newCachedThreadPool();
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Long> futureTask = threadPool.submit(() -> AsynchTest.factorial(Long.valueOf(5)));
        while(!futureTask.isDone()) {
            System.out.println("FutureTask is not finished yet.. ");
            Thread.sleep(100);
        }
        long result = futureTask.get();
        System.out.println("result: "+ result);
        threadPool.shutdown();

//        CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(() -> factorial(10l));
//        while (!completableFuture.isDone()) {
//            System.out.println("CompletableFuture is not finished yet...");
//        }
//        long result = completableFuture.get();
//        System.out.println("result: "+ result);

    }
    public static Long factorial(Long n) {
        if (n >= 1) {
            return n * factorial(n-1);
        } else
            return Long.valueOf(1);

    }
}