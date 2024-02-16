package org.pioneer.learn.datastructure.array;

import java.util.Arrays;

public class TwoSums {

    public static Integer[] isTwoSum(Integer[] arr, Integer sum){
        Integer[] result_arr = new Integer[2];
        int result = 0;
        for(int loop=0; loop<arr.length; loop++){
            for(int inner_loop=0; inner_loop<arr.length; inner_loop++){
                result = arr[inner_loop] + arr[loop];
                if(inner_loop != loop && result == sum) {
                    result_arr[0] = inner_loop;
                    result_arr[1] = loop;
                    return result_arr;
                }
            }
        }
        return result_arr;
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(isTwoSum(arr, 9)));
    }
}
