package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class OddOrEven {
    public String oddEven(int input) {

        String output = "";

        if (input % 2 == 0) {
            output = input + " is even";
        } else {
            output = input + " is odd";
        }

        return output;
    }

    @Test
    public void testPositive() {
        Assert.assertEquals("4 is even", oddEven(4));
    }

    @Test
    public void testPositiveTwo() {
        Assert.assertEquals("111 is odd", oddEven(111));
    }

}
