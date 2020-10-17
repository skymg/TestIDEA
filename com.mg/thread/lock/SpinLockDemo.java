package thread.lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁
 * 通过cas完成自旋锁
 */

public class SpinLockDemo {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock() {
        Thread thread = new Thread();
        System.out.println(Thread.currentThread().getName() + "\t come in");
        //开始自旋
        while (!atomicReference.compareAndSet(null, thread)) {
        }
    }

    public static void main(String[] args) {

    }
}
