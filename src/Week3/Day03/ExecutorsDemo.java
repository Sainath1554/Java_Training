package Week3.Day03;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {

    public static void main(String[] args) {
        int[] array = createArray(100);

        // Create an ExecutorService with fixed pool size
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Create an array of Callable tasks
        Callable<Integer>[] tasks = new Callable[5];

        // Divide the array equally into 5 parts and create tasks
        int chunkSize = array.length / 5;
        for (int i = 0; i < 5; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i + 1) * chunkSize;
            tasks[i] = new ArraySumTask(array, startIndex, endIndex);
        }

        // Submit the tasks to the executor and store the Futures
        Future<Integer>[] futures = new Future[5];
        for (int i = 0; i < 5; i++) {
            futures[i] = executor.submit(tasks[i]);
        }

        // Wait for all tasks to complete and combine the partial sums
        int totalSum = 0;
        for (int i = 0; i < 5; i++) {
            try {
                int partialSum = futures[i].get();
                totalSum += partialSum;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total Sum: " + totalSum);

        // Shutdown the ExecutorService
        executor.shutdown();
    }

    private static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}

class ArraySumTask implements Callable<Integer> {
    private int[] array;
    private int startIndex;
    private int endIndex;

    public ArraySumTask(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += array[i];
        }
        return sum;
    }
}