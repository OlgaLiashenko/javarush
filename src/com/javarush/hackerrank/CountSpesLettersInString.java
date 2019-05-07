package com.javarush.hackerrank;


import org.junit.Assert;
import org.junit.Test;

public class CountSpesLettersInString {
    public int countLetters(String input, char letter) {
        int count = 0;
        if (input == null) {
            return count;
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    @Test
    public void testPositive() {
        Assert.assertEquals(3, countLetters("oneTwoThree", 'e'));
    }

    @Test
    public void testPositiveTwo() {
        Assert.assertEquals(2, countLetters("do better", 'e'));
    }

    @Test
    public void testPositiveThree() {
        Assert.assertEquals(0, countLetters(null, 'e'));
    }
}
