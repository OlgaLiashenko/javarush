package com.javarush.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class HappyTicketForIntArray {
    public boolean isHappy(int[] ticket) {

        if (ticket == null || ticket.length % 2 != 0) {
            return false;
        }

        int sumL = 0;
        int sumR = 0;

        for (int i = 0; i < ticket.length / 2; i++) {
            sumL += ticket[i];
        }

        for (int i = ticket.length - 1; i >= ticket.length / 2; i--) {
            sumR += ticket[i];
        }


        return sumL == sumR;
    }

    @Test
    public void testPositiveResult() {
        Assert.assertEquals(true, isHappy(new int[]{1, 2, 3, 1, 2, 3}));
    }

    @Test
    public void testNegativeResult() {
        Assert.assertEquals(false, isHappy(new int[]{1, 2, 3, 5, 6, 7}));
    }

    @Test
    public void testPositiveResultWithTwoZero() {
        Assert.assertEquals(true, isHappy(new int[]{0, 0}));
    }

    @Test
    public void testNegativeResultWithZero() {
        Assert.assertEquals(false, isHappy(new int[]{0}));
    }

    @Test
    public void testOddLengthOfInput() {
        Assert.assertEquals(false, isHappy(new int[]{1, 2, 3, 1, 2}));
    }

    @Test
    public void testMaxIntInput() {
        Assert.assertEquals(true, isHappy(new int[]{2, 1, 4, 7, 4, 2, 1, 4, 7, 4}));
    }

    @Test
    public void testNull() {
        Assert.assertEquals(true, isHappy(new int[]{}));
    }
}
