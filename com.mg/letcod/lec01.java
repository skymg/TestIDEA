package letcod;

public class lec01 {
    public int[] smaller(int num[]){
        int len = num.length;
        int res[]= new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i==j) continue;
                if (num[i] > num[j])
                    res[i]++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        lec01 lec01 = new lec01();
        int s[]= {4,5,4,1,0,5};
        int[] after_sort = lec01.smaller(s);
        for (int i = 0; i < after_sort.length; i++) {
            System.out.print(after_sort[i]);
        }
    }
}
