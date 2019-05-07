package com.javarush.hackerrank;

//write a sequence of words in CamelCase as a string of letters, print the number of words in s on a new line.
//For example, s = oneTwoThree. There are 3 words in the string.

import org.junit.Assert;
import org.junit.Test;

public class CamelCaseString {
    public int camelCaseStringArray(String input) {
        int count = 0;

        /*
        String bigLetters = "ABCDEF";

        for(char letter : input.toCharArray()){
            for(char bigLetter : bigLetters.toCharArray()){
                if(letter==bigLetter){
                    count++;
                }
            }
        }
        */


        String[] words = input.split("[A-Z]");
        count = words.length;

        return count;
    }

    @Test
    public void testPositive() {
        Assert.assertEquals(3, camelCaseStringArray("oneTwoThree"));
    }
}
