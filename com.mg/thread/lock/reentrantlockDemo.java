package thread.lock;

/**
 * 可重入锁（递归锁）
 */

/**
 * 资源类
 */
class Phone{
    /**
     * 发短信
     * @throws Exception
     */
    public synchronized void sendSMS() throws Exception{
        System.out.println(Thread.currentThread().getName()+"\t invoke sendSMS");
        sendEmail();
    }
    public synchronized void sendEmail() throws Exception {
        System.out.println(Thread.currentThread().getName() + "\t invoke sendEmail");
    }

    }
public class reentrantlockDemo {
    public static void main(String[] args) {
        //reenlock();


    }
    //可重入锁
    public static void reenlock() {
        Phone phone = new Phone();
        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t1").start();
        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t2").start();
    }
}
