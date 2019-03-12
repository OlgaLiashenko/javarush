package com.javarush.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeString {

    public static final int MAX_LENGTH = 50;

    public String isPalindrome(String input) {

//        char[] letters = input.toCharArray();
//        int index = letters.length;
//        String answer = "Yes";

        /*
        for (int i = 0; i < letters.length / 2; i++) {
            if (letters[i] == letters[index - 1]) {
                index--;
            } else {
                answer = "no";
            }
        }
        */

        if (input == null || input.equals("") || !input.matches("[a-z]+") || input.length() > MAX_LENGTH) {
            return "No";
        }

        for (int i = 0; i < input.length() / 2; i++) {


            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return "No";
            }
        }

        return "Yes";


    }

    @Test
    public void test1() {
        String input = "madam";
        String result = isPalindrome(input);
        Assert.assertEquals("Is palindrome: ", "Yes", result);
    }

    @Test
    public void test2() {
        String input = "java";
        String result = isPalindrome(input);
        Assert.assertEquals("Is palindrome: ", "No", result);
    }

    @Test
    public void test3() {
        String input = null;
        String result = isPalindrome(input);
        Assert.assertEquals("Is palindrome: ", "No", result);
    }

    @Test
    public void test4() {
        String input = "";
        String result = isPalindrome(input);
        Assert.assertEquals("Is palindrome: ", "No", result);
    }

    @Test
    public void test5() {
        String input = "y5hello!";
        String result = isPalindrome(input);
        Assert.assertEquals("Is palindrome: ", "No", result);
    }
}
