package collection;

import org.junit.Test;

public class StaticTest {
    static int i;

    public int method(){
        i++;
        System.out.println("i++++++"+i);
        return i;

    }

    public static void main(String[] args) {
        StaticTest ts = new StaticTest();
        ts.method();
        System.out.println(i);
        System.out.println(ts.method());
    }
    @Test
    public void test03(){
        String s1 = "hello";
        String s2 = "hello";
        int i = 0XFFFFFFF1;
        System.out.println(i);
        int j =-i;
        System.out.println(j);
        if (s1.equals(s2)) {
            System.out.println("s1 = \"hello\"");
        }
        else {
            System.out.println("s1 !=hello");
        }
    }
}
