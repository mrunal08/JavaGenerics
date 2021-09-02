package com.javagenerics;

public class UC1 {
    public static void main(String[] args){
        int[] a={1,2,3};
        double[] b={1.3,2.9,1.3};
        char[] c={'M','R','U','N','A','L'};

        toPrint(a);
        toPrint(b);
        toPrint(c);
    }

    private static void toPrint(int[] a) {
        for(int i:a){
            System.out.println(i);
        }
        System.out.println();
    }

    private static void toPrint(double[] b) {
        for(double i:b){
            System.out.println(i);
        }
        System.out.println();
    }

    private static void toPrint(char[] c) {
        for(char i:c){
            System.out.println(i);
        }
        System.out.println();
    }
}
