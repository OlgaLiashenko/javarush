package com.javarush.level10;
//Правильный ответ: d = 5.5

public class DoubleExampleTwo {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / (float) e;
        System.out.println(d);
    }
}
