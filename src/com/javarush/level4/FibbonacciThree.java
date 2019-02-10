package com.javarush.level4;

public class FibbonacciThree {


    public static void main(String[] args) {
        int numbers[] = new int[1];

        int testNumber = getFibbonacciNumberFasterRecursion(4, numbers);
        System.out.println(testNumber);

        for (int i = 0; i < 100; i++) {
            System.out.print(getFibbonacciNumberFasterRecursion(i, numbers) + " ");
        }

    }


    public static int getFibbonacciNumberFasterRecursion(int n, int[] numbers) {

        if (numbers == null || numbers.length <= n) {
            numbers = new int[n + 1];
        }

        if (n == 0) {
            numbers[n] = 0;
            return numbers[n];
        }
        if (n == 1) {
            numbers[n] = 1;
            return numbers[n];
        }

        if (numbers[n] == 0) {
            numbers[n] = getFibbonacciNumberFasterRecursion(n - 1, numbers) + getFibbonacciNumberFasterRecursion(n - 2, numbers);
        }
        return numbers[n];
    }

}
