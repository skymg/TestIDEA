package sorted;

import java.util.Arrays;

/**
 * 插入排序
 * 从小到大排序
 * 把n个待排序的元素分为一个有序表和一个无序表
 * 先把第一个数作为有序
 */
public class Insertsort {
    public static void main(String[] args) {
        int arr[] = {101,34,114,4,-7,0};
        InsertSorted(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void InsertSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1] = insertValue;
        }
    }
}
