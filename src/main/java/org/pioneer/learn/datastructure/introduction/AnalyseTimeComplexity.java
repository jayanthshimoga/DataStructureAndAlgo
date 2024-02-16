package org.pioneer.learn.datastructure.introduction;

public class AnalyseTimeComplexity {
    public static void print_loops(int n){
        for (int loop=100; loop<n; loop++){
            System.out.println(loop);
            for(int inner_loop=0; inner_loop < 10; inner_loop++) {
                System.out.println(inner_loop);
            }
        }

    }
    public static void main(String[] args) {
        AnalyseTimeComplexity.print_loops(110);
    }
}
