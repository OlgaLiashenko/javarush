package com.javarush.leetcode;

//Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//You may return any answer array that satisfies this condition.
//Example 1:
//Input: [3,1,2,4]
//Output: [2,4,3,1]

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] input) {
      /*  ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                list.add(0, input[i]);
            } else {
                list.add(input[i]);
            }
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result; */

        int[] result = new int[input.length];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                result[index++] = input[i];
            }
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 1) {
                result[index++] = input[i];
            }
        }
        return result;
    }

    @Test
    public void test1() {
        int[] input = {3, 1, 2, 4, 5};
        int[] result = sortArrayByParity(input);
//    Assert.assertArrayEquals(new int[]{4,2,3,1,5}, result); // method1
        Assert.assertArrayEquals(new int[]{2, 4, 3, 1, 5}, result); //method2

    }
}
