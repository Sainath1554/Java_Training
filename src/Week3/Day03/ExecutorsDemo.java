package Week3.Day03;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            values.add(i+1);
        }

        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Callable<Integer>> tasks = new ArrayList<>();

        // Divide the array equally into 5 parts and create tasks
        int chunkSize = values.size() / 5;
        for (int i = 0; i < 5; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i + 1) * chunkSize;
            List<Integer> individualList = new ArrayList<>();
            for(int j=startIndex;j<endIndex;j++)
            {
                individualList.add(values.get(j));
            }
            tasks.add(new ArraySumTask(individualList));
        }

        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            futures.add(executor.submit(tasks.get(i)));
        }

        // Wait for all tasks to complete and combine the partial sums
        int totalSum = 0;
        for (int i = 0; i < 5; i++) {
            try {
                int partialSum = futures.get(i).get();
                System.out.println(partialSum);
                totalSum += partialSum;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total Sum: " + totalSum);

        executor.shutdown();
    }
}

class ArraySumTask implements Callable<Integer> {

    List<Integer> individualList;
    public ArraySumTask( List<Integer> individualList) {
        this.individualList = individualList;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i=0;i<individualList.size();i++)
        {
            sum+=individualList.get(i);
        }
        return sum;
    }
}