package Practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a Callable task
        Callable<Integer> task = () -> {
            // Perform some computation or long-running task
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
                Thread.sleep(1000); // Simulate some delay
            }
            return sum;
        };

        // Submit the task to the executor
        Future<Integer> future = executor.submit(task);

        // Perform other tasks or operations while the Callable is being executed

        try {
            // Get the result of the Callable task
            int result = future.get();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the ExecutorService
        executor.shutdown();
    }
}
