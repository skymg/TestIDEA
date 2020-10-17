package collection;

class People {

    String name;

    public People() {

        System.out.print(1);

    }
    public People(String name) {

        System.out.print(2);

        this.name = name;

    }

}
class Child extends People {
    People father;
    public Child(String name) {
        System.out.print(3);
        this.name = name;
        father = new People(name + ":F");

    }

    public Child() {

        System.out.print(4);

    }

}


public class testttt {
    public static void main(String[] args) {
//        Child mike = new Child("mike");
//        System.out.println(mike);
        String s= null;
       // s.concat("abc");
        System.out.println(1);
        String mm = "1212";



        char[] chars = mm.toCharArray();
        System.out.println(chars);
        String s1 = "a"+5+'c';
        System.out.println(s1);
        s1=new StringBuffer().append("a").append("c").toString();
        System.out.println(s1);
        StringBuffer s2= new StringBuffer().append("ew");
        System.out.println(s2);


    }
}
