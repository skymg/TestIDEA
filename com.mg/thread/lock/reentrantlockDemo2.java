package thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 证明可重入锁
 * 可重入锁默认为非公平锁 false
 */
class Phone1 implements Runnable{
    Lock lock = new ReentrantLock();

    public void getLock(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"\t get lock");
        settLock();
        lock.unlock();
    }
    public void settLock(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"\t sett lock");
        lock.unlock();
    }

    @Override
    public void run() {
    getLock();
    }
}
public class reentrantlockDemo2 {
    public static void main(String[] args) {
    Phone1 phone = new Phone1();
    Thread t1 = new Thread(phone,"t1");
    Thread t2 = new Thread(phone,"t2");
    t1.start();
    t2.start();
    }
}
