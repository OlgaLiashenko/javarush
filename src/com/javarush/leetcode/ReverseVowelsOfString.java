package com.javarush.leetcode;

//Write a function that takes a string as input and reverse only the vowels of a string.
//Example 1:
//Input: "hello"
//Output: "holle"
//Example 2:
//Input: "leetcode"
//Output: "leotcede"
//Note:
//The vowels does not include the letter "y".

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsOfString {
    public String reserveVowels(String input) {

        if (input == null || input.equals("")) {
            return input;
        }
        char[] inputLetters = input.toCharArray();
        int k = input.length();
        for (int i = 0; i < k; i++) {
            if (isVowel(inputLetters[i])) {
                for (int j = k - 1; j > i; j--) {
                    if (isVowel(inputLetters[j])) {
                        char temp = inputLetters[i];
                        inputLetters[i] = inputLetters[j];
                        inputLetters[j] = temp;
                        k = j;
                        break;
                    }
                }
            }
        }


        StringBuilder sb = new StringBuilder();
        for (char c : inputLetters) {
            sb.append(c);
        }

        return sb.toString();
    }

    @Test
    public void test1() {
        Assert.assertEquals("qweraty", reserveVowels("qwarety"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("qweeraty", reserveVowels("qwaerety"));
    }

    public boolean isVowel(char letter) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(Character.toString(letter));
    }
}
