package org.pioneer.learn.datastructure.introduction;

public class AnalyseTimeComplexityThree {

    public static void print_loops(int n, int m){
        for (int loop=1; loop < n; loop++){
            System.out.println(loop);
        }

        for (int loop=1; loop < n; loop++){
            System.out.println(loop);
        }

        for (int loop=1; loop < m; loop++){
            System.out.println(loop);
        }

    }
    public static void main(String[] args) {
        AnalyseTimeComplexityThree.print_loops(10, 20);
    }
}
