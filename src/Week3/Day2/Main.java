package Week3.Day2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args)
    {
        Thread t = new Thread(){
            @Override
            public void run()
            {
                try {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        };
        t.start();
    }
}

