package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLeftRotation {
    static int[] rotateLeft(int[] inputArray, int delimeter) {


        if (inputArray == null || delimeter < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        if (inputArray.length < delimeter) {
            delimeter = delimeter % inputArray.length;
        }

        /*
        // 1 option

        //Store delimeter elements in inputArray temp array
        int[] tempArr = new int[delimeter];
        for (int i = 0; i < delimeter; i++) {
            tempArr[i] = inputArray[i];
        }

        //Shift rest of the arr[]
        for (int i = 0; i < delimeter; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j + 1];
            }
        }
        //Store back the delimeter elements
        int index = 0;
        for (int i = inputArray.length - 1; i >= inputArray.length - delimeter; i--) {
            inputArray[inputArray.length - delimeter + index] = tempArr[index++];
        }
        return inputArray;
        */


        /*
        // 2 option

        for (int i = 0; i < delimeter; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                int temp = inputArray[j];
                inputArray[j] = inputArray[j + 1];
                inputArray[j + 1] = temp;
            }
        }
                return inputArray;

        */

        // 3 option
        int[] result = new int[inputArray.length];
        int indexResult = 0;
        for (int i = delimeter; i < inputArray.length; i++) {
            result[indexResult] = inputArray[i];
            indexResult++;
        }
        for (int i = 0; i < delimeter; i++) {
            result[indexResult] = inputArray[i];
            indexResult++;
        }
        return result;
    }

    @Test
    public void testPositiveResult() {
        int[] input = {1, 2, 3, 4, 5};
        int n = 4;
        int[] result = rotateLeft(input, n);
        Assert.assertArrayEquals(new int[]{5, 1, 2, 3, 4}, result);
    }

    @Test
    public void testZeroDelimeter() {
        int[] input = {1, 2, 3, 4, 5};
        int n = 0;
        int[] result = rotateLeft(input, n);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testDelimeterLongerThanInput() {
        int[] input = {1, 2, 3, 4, 5};
        int n = 7;
        int[] result = rotateLeft(input, n);
        Assert.assertArrayEquals(new int[]{3, 4, 5, 1, 2}, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeDelimeter() {
        int[] input = {1, 2, 3, 4, 5};
        int n = -4;
        rotateLeft(input, n);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInputArray() {
        int n = 2;
        rotateLeft(null, n);
    }
}
