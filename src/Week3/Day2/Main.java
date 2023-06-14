package Week3.Day2;

public class Main {
    public static void main(String[] args)
    {
        Thread t = new Thread(){
            @Override
            public void run()
            {
                for(int i=1;i<=10;i++)
                {
                    System.out.println(i);
                }
            }
        };
        t.start();
    }
}

