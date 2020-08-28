package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    @Test
    public void CollectionTest1(){
        Collection collection = new ArrayList();
        collection.add(112);
        collection.add(456);
        collection.add(new Person(12,"tom"));
        collection.add(new Person(11,"jerry"));
        collection.remove(112);
        System.out.println(collection.contains(new Person(11,"jerry")));
        System.out.println(collection);
        System.out.println(collection.remove(new Person(11,"jerry")));
        System.out.println(collection);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
