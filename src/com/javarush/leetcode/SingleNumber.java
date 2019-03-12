package com.javarush.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//Example 1:
//Input: [2,2,1]
//Output: 1
public class SingleNumber {
    public int singleNumber(int[] input) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int anInput : input) {
            map.put(anInput, 0);
        }

        for (int number : input) {
            map.put(number, map.get(number) + 1);
            //[] 2 2 1
            //map {2,0} {1,0}
            // {2,1} {1,0}
            // {2,2} {1,0}
            // {2,2} {1,1}
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }
        return 0;

        /*
        int result = 0;
    for(int i : nums) {
        result ^= i;
    }
    return result;
         */
    }

    @Test
    public void test1() {
        int[] input = {2, 2, 1, 33, 33};
        int result = singleNumber(input);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test2() {
        int[] input = {0};
        int result = singleNumber(input);
        Assert.assertEquals(0, result);
    }
}
