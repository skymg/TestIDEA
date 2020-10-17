package letcod;

import java.util.ArrayList;
import java.util.List;

public class IsPrime {
    public List Pan(int[] str) {
        List l1 = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            boolean flag = true;

            if (str[i] != 1) {
                for (int j = 2; j < str[i]; j++) {
                    if (str[i] % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    l1.add(str[i]);
                }
            } else {
                break;
            }
        }
        //System.out.println(l1);
        return l1;

    }

    public static void main(String[] args) {
        int[] numbers = {3,5,11,12};
        IsPrime is = new IsPrime();
        List l2 = is.Pan(numbers);
        System.out.println(l2);
        
    }
}
