package com.javagenerics;

public class UC3 <X,Y,Z>{
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public UC3(X[] myArray, Y[] myArray1, Z[] myArray2) {
        this.myXArray = myArray;
        this.myYArray = myArray1;
        this.myZArray = myArray2;
    }

    public static void main(String[] args){
        Integer[] a={1,2,3};
        Double[] b={1.3,2.9,1.3};
        Character[] c={'M','R','U','N','A','L'};

        toPrint(a);
        toPrint(b);
        toPrint(c);

        new UC3<Integer,Double,Character>(a,b,c).toPrint();


    }

    private void toPrint(){
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);

    }

    private static <E> void toPrint(E[] c) {
        for (E i : c) {
            System.out.println(i);
        }
        System.out.println();

    }

}
