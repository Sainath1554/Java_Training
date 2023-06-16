package Week3.Day03;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
class User
{
     int tickets = 1000;
    public synchronized void getTickets() {
        tickets--;
        System.out.println(tickets+" "+Thread.currentThread().getName());
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        User usr = new User();

        for (int i = 0; i < 5; i++) {
            threads.add(new Thread()
            {
                @Override
                public void run()
                {
                    while(usr.tickets>0)
                    {
                        usr.getTickets();
                    }
                }
            });
        }
        for(Thread t:threads)
        {
            t.start();
        }
    }
}
