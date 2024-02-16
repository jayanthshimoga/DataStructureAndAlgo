package org.pioneer.learn.algorithm.sorting;

import java.util.Arrays;

public class SelectionSortNew {

    public static void main(String[] args) {

        Integer[] arr = {8, 5, 1, 6, 7, 9, -1, -9};

        for(int loop=0; loop<arr.length-1; loop++){
            int smallest_index = loop;
            for(int inner_loop=loop+1; inner_loop<arr.length; inner_loop++){
                if(arr[inner_loop]<arr[loop]){
                    smallest_index = inner_loop;
                }
            }
            int temp = arr[smallest_index];
            arr[smallest_index] = arr[loop];
            arr[loop] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
