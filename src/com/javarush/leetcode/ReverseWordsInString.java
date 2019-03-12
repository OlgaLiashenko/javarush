package com.javarush.leetcode;
//Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//Example 1:
//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInString {
    public String reverseWords(String input) {
        if (input == null || input.equals("")) {
            return input;
        }
        char delimeter = ' ';
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        int tempIndex = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == delimeter) {
                for (int j = i - 1; j > tempIndex; j--) {
                    result.append(chars[j]);
                }
                tempIndex = i;
                result.append(delimeter);
            }
            //last word
            if (i == input.length() - 1) {
                for (int j = i; j > tempIndex; j--) {
                    result.append(chars[j]);
                }
            }
        }
        return result.toString();
    }

    @Test
    public void checkReverseStringPositive() {
        Assert.assertEquals("tupni drow aet", reverseWords("input word tea"));
    }

    @Test
    public void checkReverseStringPositive2() {
        Assert.assertEquals("eeeeeeeeeeeere", reverseWords("ereeeeeeeeeeee"));
    }

    @Test
    public void checkReverseStringPositive3() {
        Assert.assertEquals("  ee eeeeeeeeeere ", reverseWords("  ee ereeeeeeeeee "));
    }
}
