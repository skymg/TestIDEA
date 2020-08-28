import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestInterger {
    private String name;

    public TestInterger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        /*Integer i1 = 100, i2 = 100, i3 = 200, i4 = 200;
        System.out.println(i1==i2);  //true
        System.out.println(i3==i4);  //flase
        */

        TestInterger s1 = new TestInterger("ming");
        TestInterger s2 = new TestInterger("ming");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //false
        String s3 = new String("ming");
        String s4 = new String("ming");
        System.out.println(s3==s4);   //false
        System.out.println(s3.equals(s4)); //false
        //hashcode
        String sha1 = new String("通话");
        String sha2 = new String("重地");
        System.out.println(sha1.hashCode()); //1179395
        System.out.println(sha2.hashCode()); //1179395
        System.out.println(sha1==sha2);   //false
        System.out.println(Math.round(-1.3)); //-1
        String s5 = "ming";
        String s6 = "ming";
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

        //集合
        List l1 = new ArrayList();
        l1.add(12);
        l1.remove(0);
        System.out.println(l1);
        Map map = new HashMap();
        map.put("name","xiaoming");
        map.put("age",12);

        System.out.println(map);

    }
}
