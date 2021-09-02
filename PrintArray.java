package com.javagenerics;

public class PrintArray {
    public static void main(String[] args){
        Integer[] intArray={1,2,3};
        Double[] doubleArray={1.3,2.9,1.3};
        Character[] characterArray={'M','R','U','N','A','L'};

        PrintArray.toPrint(intArray);
        PrintArray.toPrint(doubleArray);
        PrintArray.toPrint(characterArray);
    }

    private static void toPrint(Integer[] inputArray) {
        for(int element :inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    private static void toPrint(Double[] inputArray) {
        for(double element :inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }
    private static void toPrint(Character[] inputArray) {
        for(char element :inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }

}
