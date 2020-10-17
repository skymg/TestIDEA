package collection;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public void CollectionTest1() {
        Collection collection = new ArrayList();
        collection.add(112);
        collection.add(456);
        collection.add(new Person(12, "tom"));
        collection.add(new Person(11, "jerry"));
        collection.remove(112);
        System.out.println(collection.contains(new Person(11, "jerry")));
        System.out.println(collection);
        System.out.println(collection.remove(new Person(11, "jerry")));
        System.out.println(collection);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(new String("哈哈"));
        list.add(new Person(12, "小米"));
        System.out.println(list.hashCode());
        Object[] array = list.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        List list1 = Collections.synchronizedList(list);
        boolean empty = list1.isEmpty();
        System.out.println(empty);

    }

    @Test
    public void Test2() {
        TreeSet treeSet = new TreeSet();

        treeSet.add(new Person(13, "hah1"));
        treeSet.add(new Person(12, "hah"));
        treeSet.add(new Person(11, "hah3"));
        treeSet.add(new Person(10, "hah34"));
        treeSet.add(new Person(16, "hah21"));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test3() {
//        int s  = 4;
//
//        int f = ++s;
//        System.out.println(s);
//        System.out.println(f);
        String s = "1231234567";
        int length = s.length();
        String str[] = s.split("");
        System.out.println(Arrays.asList(str));
        List l = Arrays.asList(s);
        System.out.println("888888888");
        System.out.println(l);
        List list = new ArrayList();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        System.out.println(list);
        short s1 = 1;
        s1 = (short) (s1+1);
        System.out.println(s1);
    }
    @Test
    public void test4(){
//        System.out.println(Math.round(11.3));
//        System.out.println(Math.round(11.6));
//        System.out.println(2 << 3);
//        int a[] = {2,3,4,5};
//        String aa = "12rw";
//        System.out.println(a.length);
//        System.out.println(aa.length());
//        String s1 = "Programming";
//        String s2 = new String("Programming");
//        String s3 = "Program" + "ming";
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s1.intern());
//        for (int i=0;i<3; i++) {
//            System.out.print(i);
//        }
//        System.out.print(i);
//        float f=5+5.5;
//        public final static int max_Value = 1000;
//        public final static int maxValue = 1000
        int i = 1+2;
        System.out.println(i++);
    }
}
