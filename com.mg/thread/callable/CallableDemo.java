package thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * callable demo
 */
class MyThread2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1024;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread2());
        new Thread(futureTask, "AA").start();
        System.out.println(Thread.currentThread().getName() + "******");
        //任务完成后再获取值
        while (!futureTask.isDone()) {
        }
        Integer res = futureTask.get();
        System.out.println("res=" + res);

    }
}
