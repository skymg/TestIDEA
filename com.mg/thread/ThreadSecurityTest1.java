package thread;

/**
 * 同步方法
 */
class Ticket3 implements Runnable {
    int ticket = 100;
    public void run() {
        while (true) {
            show();
        }
    }

    public synchronized void show() {
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

public class ThreadSecurityTest1 {
    public static void main(String[] args) {

        Ticket3 ticket3 = new Ticket3();
        Thread thread1 = new Thread(ticket3);
        Thread thread2 = new Thread(ticket3);
        Thread thread3 = new Thread(ticket3);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

