package thread;

/**
 * 同步代码块
 */
class Ticket implements Runnable {
    int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (object) {
                if (ticket > 0) {
                    try {
                        Thread.currentThread().sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + ticket--);
                }
            }
        }
    }
}

public class ThreadSecurityTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        t1.start();
        t2.start();
        t3.start();
    }
}
