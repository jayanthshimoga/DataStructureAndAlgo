package org.pioneer.learn.datastructure.introduction;

public class FibonacciRecursion {

    public static Integer fibonacci(int n){
        if (n<=1){
            return n;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }

    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.println("Fibonacci Series of "+maxNumber+" is: ");
        for (int loop=0; loop < maxNumber; loop++){
            System.out.println(fibonacci(loop)+ " ");
        }
    }
}
