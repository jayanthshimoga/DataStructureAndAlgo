package org.pioneer.learn.algorithm.sorting;

import java.util.Arrays;

public class BubbleSortOptimised {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 6, 7, 9, -1, -9};
        int temp = 0;
        for(int outer_loop=0; outer_loop< arr.length-1; outer_loop++) {
            boolean swapped = false;
            for (int loop = 0; loop < arr.length - outer_loop - 1; loop++) {
                if (arr[loop] > arr[loop + 1]) {
                    temp = arr[loop + 1];
                    arr[loop + 1] = arr[loop];
                    arr[loop] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
