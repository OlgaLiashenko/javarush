package com.javarush.hackerrank;

public class FloydTriangle {
    public static void main(String[] args) {


        int startNumber = 1;
        int length = 15;

        for (int i = startNumber; i <= length; i++) {
            for (int j = startNumber; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
