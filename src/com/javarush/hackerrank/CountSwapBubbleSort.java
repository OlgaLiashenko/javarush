package com.javarush.hackerrank;

import org.junit.Test;

public class CountSwapBubbleSort {
    static void countSwaps(int[] array) {
        int countSwap = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    countSwap++;
                }
            }
        }

        System.out.println("Array is sorted in " + countSwap + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
    }

    @Test
    public void positiveResult() {
        countSwaps(new int[]{3, 2, 1, 4});
    }
}
