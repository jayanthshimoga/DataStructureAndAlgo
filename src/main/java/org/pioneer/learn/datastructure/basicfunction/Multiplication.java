package org.pioneer.learn.datastructure.basicfunction;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer value = input.nextInt();

        for(int loop=1; loop<=value; loop++){
            for(int inner_loop=1; inner_loop<=10; inner_loop++) {
                System.out.printf(" %d * %d = %d \n", loop, inner_loop, loop * inner_loop);
            }
            System.out.println("**********************************");
        }
    }
}
