package com.javarush.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class HappyTForStr {

    public boolean isHappy(String ticket) {
        if (ticket == null || ticket.length() % 2 != 0) {
            return false;
        }

        String[] numbers = ticket.split("");
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < numbers.length / 2; i++) {
            sumLeft = sumLeft + Integer.parseInt(numbers[i]);
        }

        for (int i = numbers.length - 1; i >= numbers.length / 2; i--) {
            sumRight += Integer.parseInt(numbers[i]);
        }


        return sumLeft == sumRight;
    }

    @Test
    public void testPositiveResult() {
        Assert.assertEquals(true, isHappy("123123"));
    }

    @Test
    public void testNegativeResult() {
        Assert.assertEquals(false, isHappy("123567"));
    }

    @Test
    public void testPositiveResultWithTwoZero() {
        Assert.assertEquals(true, isHappy("00"));
    }

    @Test
    public void testNegativeResultWithZero() {
        Assert.assertEquals(false, isHappy("0"));
    }

    @Test
    public void testOddLengthOfInput() {
        Assert.assertEquals(false, isHappy("12312"));
    }

    @Test
    public void testMaxIntInput() {
        Assert.assertEquals(true, isHappy("2147421474"));
    }

    @Test
    public void testNull() {
        Assert.assertEquals(false, isHappy(null));
    }
}
