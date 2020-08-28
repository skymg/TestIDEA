package thread;

/**
 * 线程不安全    窗口1:-1
 */
class TicketTest implements Runnable {
    int ticket = 100;
    public void run() {
        while (true) {
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

public class WindowTest1 {
    public static void main(String[] args) {
        TicketTest ticketTest = new TicketTest();
        Thread t1 = new Thread(ticketTest);
        Thread t2 = new Thread(ticketTest);
        Thread t3 = new Thread(ticketTest);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }


}
