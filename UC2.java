package com.javagenerics;

public class UC2 {

    public static void main(String[] args){
        Integer[] a={1,2,3};
        Double[] b={1.3,2.9,1.3};
        Character[] c={'M','R','U','N','A','L'};

        toPrint(a);
        toPrint(b);
        toPrint(c);
    }

    //here E extends Root Object so it will directly
    // take all the datatypes provided to it
    // and we dont need to write this code again an again for all 3 datatypes

    private static <E> void toPrint(E[] c) {
        for(E i:c){
            System.out.println(i);
        }
    }

}
