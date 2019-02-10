package com.javarush.level4;

public class FibbonacciFour {
    public static void main(String[] args) {

        int[] fibbArray = getFibbonacciArray(100);

        int testNumber = fibbArray[4];
        System.out.println(testNumber);


        for (int i = 0; i < fibbArray.length; i++) {
            System.out.print(fibbArray[i] + " ");
        }
    }

    public static int[] getFibbonacciArray(int size) {

        int[] result = new int[size];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < size; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

}
