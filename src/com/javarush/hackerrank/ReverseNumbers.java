package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNumbers {
    public int reverseNumber(int input) {
        int result = 0;

        while (input != 0) {

            result = result * 10;
            result = result + input % 10;
            input = input / 10;
        }

        return result;
    }

    @Test
    public void testPositive() {
        Assert.assertEquals(54321, reverseNumber(12345));
    }
}
