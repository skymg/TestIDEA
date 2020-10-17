package collection;

import org.junit.Test;


public class AutoIncrease {
    public static void main(String[] args) {
        int i  =1;
        i = i++;
        System.out.println("i:"+i);
        i = i++;
        System.out.println("i:"+i);
        int j = i++;
        System.out.println("i:"+i+",j:"+j);

        int k = i+ ++i * i++;
        System.out.println("i:"+i+",j:"+j+",k="+k);

    }
    @Test
    public  void Test01(){
        int price = 10;
        int number = 0;
        int money = 0;
        for (int i = 0; i < 2; i++) {
            //number = number++;
            number++;
            System.out.println("第"+i+"次,number为："+number);
            --price;
            System.out.println("第"+i+"次,price："+price);
            money+=number*price;
            System.out.println("第"+i+"次,money："+money);

        }
        System.out.println(money);
    }

}
