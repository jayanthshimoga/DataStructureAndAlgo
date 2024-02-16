package org.pioneer.learn.datastructure.introduction;

public class AnalyseTimeComplexityTwo {
    public static void print_loops(int n){
        for (int loop=1; loop < n; loop++){
            for(int inner_loop=1; inner_loop < n; inner_loop++) {
                System.out.println(loop * inner_loop);
            }
            System.out.println("--------------------------------------------------------");
        }

    }
    public static void main(String[] args) {
        AnalyseTimeComplexityTwo.print_loops(10);
    }
}
