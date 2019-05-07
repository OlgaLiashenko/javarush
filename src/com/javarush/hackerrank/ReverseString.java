package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString {
    public String reversString(String input) {

        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result = result + input.charAt(i);
        }
        return result;
    }


    @Test
    public void testPositive() {
        Assert.assertEquals("olleh", reversString("hello"));
    }
}
