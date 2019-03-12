package com.javarush.leetcode;
//Write a function that reverses a string. The input string is given as an array of characters char[].
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//You may assume all the characters consist of printable ascii characters.
//Example 1:
//Input: ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]

import org.junit.Assert;
import org.junit.Test;

public class ReverseString {
    public char[] reverseString(char[] input) {
        /*
        char[] result = new char[input.length];
        int index = 0;
        for(int i=input.length-1; i>=0; i--){
            result[index++] = input[i];
        }
        return result;
    }
    */

        for (int i = 0; i < input.length / 2; i++) {
            swap(input, i, input.length - 1 - i);
        }
        return input;
    }

    public void swap(char[] arr, int indexFirst, int indexSecond) {
        char temp = arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = temp;
    }

    @Test
    public void test1() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};  //
        char[] result = reverseString(input);
        Assert.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, result);
    }
}
