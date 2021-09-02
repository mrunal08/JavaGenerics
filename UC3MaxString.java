package com.javagenerics;

public class UC3MaxString {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assuming x is  the largest at start

        if (y.compareTo(max) > 0)
            max = y; // y is the largest now

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return max; // returns whichever is largest
    }


    public static void main(String[] args){
        System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Apple", "Peach", "Banana", maximum("Apple", "Peach", "Banana"));

    }
}


