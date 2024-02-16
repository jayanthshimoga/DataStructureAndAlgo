package org.pioneer.learn.datastructure.array;

import java.util.Arrays;

public class TwoSumsSorted {

    public static Integer[] isTwoSum(Integer[] arr, Integer sum){
        Integer[] result_arr = new Integer[2];
        int leftPointer = 0, rightPointer = arr.length - 1, target = 0;
        while (leftPointer < rightPointer){
            target = arr[leftPointer] + arr[rightPointer];
            System.out.println(leftPointer+" : "+rightPointer);
            System.out.println(target);
            if(sum == target){
                result_arr[0] = leftPointer;
                result_arr[1] = rightPointer;
                return result_arr;
            } else if (target > sum) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return result_arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(isTwoSum(arr, 9)));
    }
}
