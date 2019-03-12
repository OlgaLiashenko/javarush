package com.javarush.leetcode;
//Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
// also in sorted non-decreasing order.
//Example 1:
//Input: [-4,-1,0,3,10]
//Output: [0,1,9,16,100]

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfASortedArray {
    public int[] sortArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    @Test
    public void test1() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] result = sortArray(input);
        Assert.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, result);
    }
}
