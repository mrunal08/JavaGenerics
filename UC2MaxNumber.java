package com.javagenerics;

public class UC2MaxNumber {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assuming x is  the largest at start

        if (y.compareTo(max) > 0)
            max = y; // y is the largest now

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return max; // returns whichever is largest
    }


    public static void main(String[] args){
        System.out.printf("Maximum of %f, %f and %f is %f\n\n", 8.9, 4.2, 7.5, maximum(8.9, 4.2, 7.5));

    }
}

