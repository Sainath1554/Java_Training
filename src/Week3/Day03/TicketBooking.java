package Week3.Day03;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class TicketBooking implements Runnable {
    private int tickets = 1000;

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        TicketBooking ticketBooking = new TicketBooking();

        for (int i = 0; i < 5; i++) {
            threads.add(new Thread(ticketBooking));
        }
        for(Thread t:threads)
        {
            t.start();
        }
    }

    @Override
    public void run() {
        getTickets();
    }

    public synchronized void getTickets() {
        while(tickets>0) {
            tickets--;
            System.out.println(tickets + " " + Thread.currentThread().getName());
            try {
                notifyAll();
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
}
