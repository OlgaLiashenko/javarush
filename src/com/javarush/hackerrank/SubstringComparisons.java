package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstringComparisons {
    public static String substringComparisons(String input, int k) {
        String smallest = "";
        String largest = "";

        List<String> substrings = new ArrayList<>();


        if (input == null || input.length() < k) {
            return "\n";
        }

        for (int i = 0; i <= input.length() - k; i++) {
            substrings.add(input.substring(i, k + i));
        }

        Collections.sort(substrings);

        smallest = substrings.get(0);
        largest = substrings.get(substrings.size() - 1);
        return smallest + "\n" + largest;
    }


    @Test
    public void test1() {
        String inputString = "welcometojava";
        int inputNumber = 3;
        String result = substringComparisons(inputString, inputNumber);
        Assert.assertEquals("ava\nwel", result);
    }

    @Test
    public void testsize() {
        String inputString = "welcometojava";
        int inputNumber = 5;
        String result = substringComparisons(inputString, inputNumber);
        Assert.assertEquals("comet\nwelco", result);
    }

    @Test
    public void test2() {
        String inputString = "aaaaaaaaaaa";
        int inputNumber = 3;
        String result = substringComparisons(inputString, inputNumber);
        Assert.assertEquals("aaa\naaa", result);
    }

    @Test
    public void test3() {
        String inputString = "aaa";
        int inputNumber = 3;
        String result = substringComparisons(inputString, inputNumber);
        Assert.assertEquals("aaa\naaa", result);
    }

    @Test
    public void test4() {
        String inputString = "aa";
        int inputNumber = 3;
        String result = substringComparisons(inputString, inputNumber);
        Assert.assertEquals("\n", result);
    }

    @Test
    public void testNull() {
        String inputString = null;
        int inputNumber = 3;
        String result = substringComparisons(inputString, inputNumber);
        Assert.assertEquals("\n", result);
    }
}
