package org.pioneer.learn.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        Integer[] arr = {3, 5, 1, 6, 7, 9, -1, -9};
        for(int outer_loop=0;outer_loop<arr.length-1;outer_loop++) {
            int smallest_index = outer_loop;
            for (int loop = outer_loop+1; loop < arr.length; loop++) {
                if (arr[smallest_index] > arr[loop]) {
                    smallest_index = loop;
                }
            }
            int temp = arr[outer_loop];
            arr[outer_loop] = arr[smallest_index];
            arr[smallest_index] = temp;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));
    }
}
