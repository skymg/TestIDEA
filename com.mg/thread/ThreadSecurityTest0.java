package thread;

/**
 * 同步代码块
 */
class Ticket0 extends Thread {
    static int ticket = 100;
    static Object object = new Object();

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
                } else {
                    break;
                }
            }
        }
    }
}

public class ThreadSecurityTest0 {
    public static void main(String[] args) {
        Ticket0 t1 = new Ticket0();
        Ticket0 t2 = new Ticket0();
        Ticket0 t3 = new Ticket0();
        t1.start();
        t2.start();
        t3.start();
    }
}
