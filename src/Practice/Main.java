package Practice;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Counter counter = new Counter(0);
        Thread t1=new Thread()
        {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    counter.increment();
                }
            }
        };
        Thread t2 = new Thread()
        {
            public void run() {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        }
        };
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.c);
    }
}

class Counter
{
    int c;
    Counter(int i)
    {
        this.c = i;
    }
    synchronized void increment()
    {
        c++;
    }
}
