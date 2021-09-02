package com.javagenerics;


public class UC5MaxNum {

    public static void main(String[] args) {
      printMax();
    }
    public static void printMax(){
        System.out.printf("Max of %d, %d ,%d and %d is %d\n\n",
                5, 8, 9,10, maximum( 5, 8, 9,10 ));

        System.out.printf("Max of %1f,%1f ,%f,%f and %1f is %.1f\n\n",
                1.6, 8.2, 7.7,9.6 ,1.1, maximum( 1.6, 8.2, 7.7 ,9.6,1.1));

        System.out.printf("Maximum of %s, %s,%s and %s is %s\n\n","Pineapple", "Apple", "Peach", "Banana", maximum("Apple", "Peach", "Banana"));

    }
    public static <T extends Comparable<T>> T maximum(T ... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;

    }
}
