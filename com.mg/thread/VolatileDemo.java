package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class myDate{
    //int num = 0;
    volatile int num = 0;
    public void addT060() {
        this.num = 30;
    }
    //volatile不保证原子性
    public void addPlusPLus() {
        num++;
    }
    //保证原子性
    /**
     *  创建一个原子Integer包装类，默认为0
     *  保证原子性
     */
    AtomicInteger atomicInteger = new AtomicInteger();

    public void addAtomic() {
        // 相当于 atomicInter ++ 解决i++在多线程环境下的线程安全问题
        atomicInteger.getAndIncrement();
    }
}
public class VolatileDemo {
    public static void main(String[] args) {
        //seeOKByVolatile();
        //volatile不保证原子性
        myDate myDate = new myDate();
        for (int i = 1; i <= 20; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 1000; j++) {
                    myDate.addPlusPLus();
                    myDate.addAtomic();
                }
            },String.valueOf(i)).start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"\t finally number value："+myDate.num);
        System.out.println(Thread.currentThread().getName()+"\t finally number value："+myDate.atomicInteger);
    }

    //volatile保证可见性，即使通知其他线程主内存值被修改
    public static void seeOKByVolatile() {
        myDate myDate = new myDate();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"\t come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myDate.addT060();
            System.out.println(Thread.currentThread().getName()+"\t updated number value:"+myDate.num);
        },"AAA").start();
        while (myDate.num==0){
            //循环等待
        }
       // System.out.println(Thread.currentThread().getName()+"\t mission is over,main get num is"+myDate.num);
    }
}
