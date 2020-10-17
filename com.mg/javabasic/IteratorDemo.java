package javabasic;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        Map<String,Integer> map  = new HashMap<>();
        map.put("hha",1);
        map.put("hha2",2);
        map.put("hha3",3);
        map.put("hha4",4);
        /**
         * 遍历key
         */
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            System.out.println(key);
        }
        /**
         * 遍历value
         */
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /**
         * 遍历key-value
         */
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> entry = iterator1.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"--->"+value);
        }
    }

}
