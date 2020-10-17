package sorted;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 选择排序，每一次将最小值放在最前面
 */
public class SelectSorted {
    public static void main(String[] args) {
        //int arr[] = {4, 2, 5, 1, 0, 3, -5, 7, 8};
        int arr[] = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random()*800000);
        }
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
        selectSort(arr);
        Date date1 = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat1.format(date1));
        //System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int  min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}
