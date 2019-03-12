package com.javarush.level10;
//Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.

public class StaticExample {
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;
    public int A = 5;

    public static void main(String[] args) {
        StaticExample solution = new StaticExample();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        StaticExample.D = 5 * D * C;

        StaticExample.D = 5;
    }

    public int getA() {
        return A;
    }
}
