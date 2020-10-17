package collection;

public class A implements Runnable{
    @Override
    public void run() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new A());
        thread.start();

    }
}
