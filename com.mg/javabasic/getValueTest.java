package javabasic;

import java.util.*;

public class getValueTest {
    public List<String> getValueList(HashMap<String,String> map){
        ArrayList<String> ValueList = new ArrayList<>();
        Collection<String> values = map.values();
        for (String value:values){
            ValueList.add(value);
        }
        return ValueList;
    }

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("hah","11");
        map.put("hah2","113");
        map.put("hah3","114");
        getValueTest getValueTest = new getValueTest();
        List<String> list = getValueTest.getValueList(map);
        for (String l:list){
            System.out.println(l);
        }
    }

}
