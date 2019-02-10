package com.javarush.level4;

public class FibbonacciTwo {

    public static void main(String[] args) {

        int testNumber = getFibbonacciNumberRecursionSlow(4);
        System.out.println(testNumber);

        for (int i = 0; i < 8; i++) {
            System.out.print(getFibbonacciNumberRecursionSlow(i) + " ");
        }

    }

    public static int getFibbonacciNumberRecursionSlow(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return getFibbonacciNumberRecursionSlow(n - 1) + getFibbonacciNumberRecursionSlow(n - 2);
    }
}
