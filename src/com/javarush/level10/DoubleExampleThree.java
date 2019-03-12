package com.javarush.level10;
///*
//Правильный ответ: d = 1.0
//*/

public class DoubleExampleThree {
    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b / c / e;

        System.out.println(d);
    }
}
