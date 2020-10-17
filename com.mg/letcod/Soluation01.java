package letcod;

public class Soluation01 {
    public int[] replace(int arr[]){
        if (arr.length == 0) return arr;
        int length = arr.length;
        int max = arr[length - 1];
        arr[--length] = -1;
        while (length > 0) {
            int cur = arr[length - 1];
            arr[--length] = max;
            max = Math.max(max, cur);
        }
        return arr;


    }

    public static void main(String[] args) {
        Soluation01 Soluation01 = new Soluation01();
        int arr[]= {1,2,3,4,5,6,7};
        int ab []=Soluation01.replace(arr);
        for (int i = 0; i < ab.length; i++) {
            System.out.print(ab[i]);
        }


    }
}
