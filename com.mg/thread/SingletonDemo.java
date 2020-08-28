package thread;

public class SingletonDemo {
    private volatile static SingletonDemo instance;

    public SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            //加锁
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                    System.out.println("111");
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();
        System.out.println(s1 == s2);
    }
}
