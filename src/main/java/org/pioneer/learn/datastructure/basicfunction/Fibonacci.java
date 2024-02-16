package org.pioneer.learn.datastructure.basicfunction;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci series till "+n+" number is : ");

        for (int i=1; i<=n; i++){
            System.out.println(firstTerm);

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
