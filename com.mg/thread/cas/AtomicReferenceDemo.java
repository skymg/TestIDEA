package thread.cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 原子引用
 */
class User{
    String Username;
    int age;

    public User(String username, int age) {
        Username = username;
        this.age = age;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", age=" + age +
                '}';
    }
}
public class AtomicReferenceDemo {
    public static void main(String[] args) {
        User z3 = new User("zz3",12);
        User ll4 = new User("ll4",15);
        AtomicReference<User> atomicReference = new AtomicReference<User>();
        atomicReference.set(z3);
        System.out.println(atomicReference.compareAndSet(z3,ll4)+"\t"+atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(z3,ll4)+"\t"+atomicReference.get().toString());
    }
}
