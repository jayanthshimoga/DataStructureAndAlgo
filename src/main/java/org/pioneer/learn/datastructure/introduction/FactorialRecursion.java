package org.pioneer.learn.datastructure.introduction;

import java.util.Scanner;

public class FactorialRecursion {

    public static Integer factorial(int n){
        if (n==0){
            return 1;
        }
        if(n==1 || n == 2){
            return n;
        }
        return factorial(n-1) * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();

        System.out.println(factorial(value));
    }
}
