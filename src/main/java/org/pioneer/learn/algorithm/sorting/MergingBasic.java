package org.pioneer.learn.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergingBasic {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 6, 9};
        Integer[] arr2 = {3, 5, 10};
        int arrLength = arr.length-1, arr2Length = arr2.length-1;
        int i=0, j =0;

        List<Integer> list = new ArrayList<>();

        while(i<=arrLength && j<=arr2Length){
            if(arr[i]<arr2[j]){
                list.add(arr[i]);
                i=i+1;
            }else{
                list.add(arr2[j]);
                j++;
            }
        }
        for(;i<arrLength;i++){
            list.add(arr[i]);
        }
        for(;j<=arr2Length;j++){
            list.add(arr2[j]);
        }
        System.out.println(list);
    }
}
