package thread;

public class ReleaseDeadLockDemo {
    private static Object resourse1 = new Object();
    private static Object resourse2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resourse1) {
                System.out.println(Thread.currentThread() + "getresource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get res2");
                synchronized (resourse2) {
                    System.out.println(Thread.currentThread() + "get res2");
                }
            }

        }, "线程1").start();

        new Thread(() -> {
            synchronized (resourse1) {
                System.out.println(Thread.currentThread() + "get res1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "wait get res2");
                synchronized (resourse2) {
                    System.out.println(Thread.currentThread() + "get res2");
                }
            }
        }, "线程2").start();
    }
}
