package Week3.Day2;

public class Main2 {
    public static void main(String[] args)
    {
        Runnable r = ()->
        {
            try{
                for(int i=1;i<=10;i++)
                {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}

