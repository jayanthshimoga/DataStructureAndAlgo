package org.pioneer.learn.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        Integer[] arr = {8, 5, 1, 6, 7, 9, -1, -9};
        for(int outer_loop=1;outer_loop<arr.length;outer_loop++) {
            int key = arr[outer_loop];
            int inner_loop = outer_loop - 1;

            while(inner_loop>=0 && key<arr[inner_loop]){
                arr[inner_loop+1] = arr[inner_loop];
                inner_loop = inner_loop - 1;
            }
            arr[inner_loop + 1] = key;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));
    }
}
