package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class CompareStringLength {
    public boolean isLonger(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();

        return aLength > bLength;
    }

    @Test
    public void positive() {
        Assert.assertEquals(true, isLonger("hello", "hola"));
    }

    @Test
    public void positiveTwo() {
        Assert.assertEquals(false, isLonger("hello", "hola, Olga"));
    }
}