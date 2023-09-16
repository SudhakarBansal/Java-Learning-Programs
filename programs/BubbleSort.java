package practice_programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        boolean swapped;
        for (int i = 0; i < arr.length ; i++) {
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
