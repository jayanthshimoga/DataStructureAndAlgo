package org.pioneer.learn.datastructure.introduction;

public class Recursion {

    public static void recuring_function(int i){
        if(i > 3){
           return;
        }
        System.out.println(i);
        recuring_function(i + 1);
        System.out.println("The end of the call here is "+i);
    }
    public static void main(String[] args) {
        Recursion.recuring_function(1);
    }
}
