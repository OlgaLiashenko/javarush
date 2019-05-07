package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class CountALetters {
    public int countLetters(String input) {

        if (input == null) {
            return 0;
        }


        int count = 0;

        String letters = "aeiouy";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < letters.length(); j++) {
                if (input.toLowerCase().charAt(i) == letters.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    @Test
    public void testPositive() {
        Assert.assertEquals(4, countLetters("Hello, Lola"));
    }

    @Test
    public void testNull() {
        Assert.assertEquals(0, countLetters(null));
    }

    @Test
    public void testZeroALetters() {
        Assert.assertEquals(0, countLetters("Hll, Bb"));
    }

    @Test
    public void testOneLetter() {
        Assert.assertEquals(1, countLetters("a"));
    }

    @Test
    public void tesNoLettersString() {
        Assert.assertEquals(0, countLetters("12345"));
    }

    @Test
    public void testEmptyString() {
        Assert.assertEquals(0, countLetters(""));
    }

    @Test
    public void testEveryALetter() {
        Assert.assertEquals(18, countLetters("aeiouy, aeiouy, aeiouy"));
    }
}
