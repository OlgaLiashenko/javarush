package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumber {
    public int maxNumber(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array[0];
    }

    @Test
    public void testPositive() {
        Assert.assertEquals(11, maxNumber(new int[]{2, 5, 11, 4}));
    }
}
