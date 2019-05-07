package com.javarush.hackerrank;

public class Palindrome {

    public static boolean isPalindrome(String input) {

        boolean isPal = true;
        for (int i = 0; i < input.length() / 2; i++) {
            int index = 0;
            if (input.toLowerCase().charAt(i + index) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return isPal;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}

