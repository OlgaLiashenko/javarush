package com.javarush.level11;

//Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
//Каждый метод должен возвращать минимальное из двух переданных в него чисел.
public class ThreeMethodsForMinNumberOverload {
    public static void main(String[] args) {
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static long min(long a, long b) {
        return a < b ? a : b;
    }

    public static double min(double a, double b) {
        return a < b ? a : b;
    }
}


