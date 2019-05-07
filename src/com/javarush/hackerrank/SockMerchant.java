package com.javarush.hackerrank;
//For example, there are n=7 socks with colors arr=[1,2,1,2,1,3,2]. There is one pair of color 1  and one of color 2.
// There are three odd socks left, one of each color. The number of pairs is 2.
//Function Description
//Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching
// pairs of socks that are available.
// 1<=n<=100
// 1<=array[i]<=100, 0<=i<n
//Return the total number of matching pairs

import org.junit.Assert;
import org.junit.Test;

public class SockMerchant {
    static int sockMerchant(int arrayLength, int[] inputArray) {

        if (inputArray == null || arrayLength < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        int pairCount = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
        /*
        //1 option
        int tempCount = 1;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                tempCount++;
            }
//            else {
//                pairCount += tempCount / 2;
//                tempCount = 1;
//            }
        }
        pairCount=tempCount/2;

        return pairCount;
*/
        // 2 option
        for (int i = 0; i < arrayLength - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                pairCount++;
                i++;
            }
        }

        return pairCount;
    }

    @Test
    public void positiveResult() {
        int arrayLength = 9;
        int[] inputArray = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        Assert.assertEquals(3, sockMerchant(arrayLength, inputArray));
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeArrayLength() {
        int arrayLength = -2;
        int[] inputArray = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        sockMerchant(arrayLength, inputArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullArray() {
        sockMerchant(2, null);
    }

    @Test
    public void arrayLengthOne() {
        int arrayLength = 1;
        int[] inputArray = {10};
        Assert.assertEquals(0, sockMerchant(arrayLength, inputArray));
    }

    @Test
    public void positiveResultT() {
        int arrayLength = 10;
        int[] inputArray = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        Assert.assertEquals(4, sockMerchant(arrayLength, inputArray));
    }
}
