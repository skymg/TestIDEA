package sorted;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {4,3,-4};
        shellSorted(arr);
    }

    public static void shellSorted(int arr[]){
        int temp = 0;
        int count = 0;
        for (int gap = arr.length/2; gap >0 ; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i-gap; j >=0 ; j-=gap) {
                    if(arr[j]>arr[j+gap]){
                        temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第"+(++count)+"轮"+ Arrays.toString(arr));

        }
    }
}
