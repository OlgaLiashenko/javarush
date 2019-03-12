package com.javarush.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate.
// Such a word is said to complete the given string licensePlate
//Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
//Output: "steps"
public class ShortestCompletingWord {
    public String shortestWord(String licensePlate, String[] words) {

        String shortestResult = null;
        List<Character> searchedCharsList = new ArrayList<>();

        char[] letters = licensePlate.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (Character.isLetter(letters[i])) {
                searchedCharsList.add(Character.toLowerCase(letters[i]));
            }
        }

        for (String input : words) {
            char[] currentWordChars = input.toLowerCase().toCharArray();
            boolean isCorrect = false;

            for (char searchChar : searchedCharsList) {
                int foundAt = -1;
                for (int i = 0; i < currentWordChars.length; i++) {
                    if (currentWordChars[i] == searchChar) {
                        isCorrect = true;
                        foundAt = i;
                        currentWordChars[i] = '-';
                        break;
                    }
                }
                if (foundAt < 0) {
                    isCorrect = false;
                    break;
                }
            }
            if (isCorrect && (shortestResult == null || input.length() < shortestResult.length())) {
                shortestResult = input;
            }
        }


        return shortestResult;
    }


    @Test
    public void test1() {
        String result = shortestWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"});
        Assert.assertEquals("steps", result);

    }

}
