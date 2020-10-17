package thread;

/**
 * 单例模式+双端检索+volatile禁止指令重排
 */
public class SingletonDELDemo {
    //禁止指令重排volatile
    private static volatile SingletonDELDemo instance = null;

    private SingletonDELDemo() {
        System.out.println(Thread.currentThread().getName() + "\t 构造方法SingletonDELDemo");
    }

    public static SingletonDELDemo getInstance() {
        //DEL 双端检索 两次判断instance 不为空
        if (instance == null) {
            synchronized (SingletonDELDemo.class) {
                if (instance == null) {
                    instance = new SingletonDELDemo();
                }
            }
        }
        return instance;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingletonDELDemo.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}
