package thread;

public class TestThread {
    public static void main(String[] args) {
        subThread st = new subThread();
        //設置子綫程的優先級,高不一定先執行
        st.setPriority(10);
        st.start();
        //设置主线程名字
        Thread.currentThread().setName("Main:");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
//            if (i == 20) {
//                try {
//                    //jon() 当线程A执行到此处，调用线程B的方法，直到线程B执行完毕，A再次执行
//                    st.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }


}

/**
 * 继承Thread类
 * 重写run方法
 * 通过start()调用
 */
class subThread extends Thread {
    public void run() {
        /**
         * 子线程要知行的方法放到run()方法中
         */
        Thread.currentThread().setName("subThread");
        for (int i = 0; i < 100; i++) {
            //设置子线程名字
            System.out.println(Thread.currentThread().getName() + ":"+Thread.currentThread().getPriority() + ":"  + i);
        }
    }
}