package org.pioneer.learn.datastructure.array;

public class Palindrome {

    public static boolean Palindrome(String str){
        int leftPointer = 0, rightPointer =  str.length() - 1;

        while(leftPointer < rightPointer){
            System.out.println(leftPointer+" "+rightPointer);
            if(str.charAt(leftPointer) != str.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome("racecar"));
    }
}
