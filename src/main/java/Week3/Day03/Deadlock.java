package Week3.Day03;

public class Deadlock {
    public static void main(String[] args)
    {
        AnotherThread t = new AnotherThread();
        AnotherThread.mainThread = Thread.currentThread();
        t.start();
        System.out.println("Hello");
        try {
            t.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class AnotherThread extends Thread
{
    static Thread mainThread;
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hi");
            try {
                mainThread.join();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

