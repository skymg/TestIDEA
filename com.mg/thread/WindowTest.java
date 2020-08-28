package thread;

/**
 * 线程不安全  Thread-2票号：-1
 */
class Window extends Thread {
    static int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.currentThread().sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"票号："+ticket--);
            }
            else {
                break;
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        /**
         * 三个对象
         */
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        w1.start();
        w2.start();
        w3.start();
    }
}
