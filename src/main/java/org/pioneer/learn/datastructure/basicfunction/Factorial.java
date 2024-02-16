package org.pioneer.learn.datastructure.basicfunction;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();

        Integer initialValue = 1;
        for(int loop=1; loop<=value; loop++){
            initialValue = initialValue * loop;
        }
        System.out.printf("The result is %d ", initialValue);
    }
}
