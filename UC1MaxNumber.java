package com.javagenerics;

public class UC1MaxNumber {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assuming x is  the largest at start

        if (y.compareTo(max) > 0)
            max = y; // y is the largest now

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return max; // returns whichever is largest
    }


    public static void main(String[] args){
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));

    }
}
