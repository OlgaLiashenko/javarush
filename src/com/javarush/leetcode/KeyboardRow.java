package com.javarush.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

//Given a List of words, return the words that can be typed using letters of alphabet on only one row's of
// American keyboard like the image below.
//Note:
//You may use one character in the keyboard more than once.
//You may assume the input string will only contain letters of alphabet.
//Example:
//Input: ["Hello", "Alaska", "Dad", "Peace"]
//Output: ["Alaska", "Dad"]
public class KeyboardRow {
    public String[] keyboardRow(String[] words) {
//        String firstRow = "qwertyuiop";
//        char [] charFirst = firstRow.toCharArray();
//        String secondRow = "asdfghjkl";
//        String thirdRow = "zxcvbnm";

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() == 0) {
                continue;
            }
            if (word.toLowerCase().matches("[qwertyuiop]+|[asdfghjkl]+|[zxcvbnm]+")) {

                result.add(word);
            }
        }

        String[] output = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;

    }

    @Test
    public void test1() {
        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = keyboardRow(input);
        Assert.assertArrayEquals("Expect", new String[]{"Alaska", "Dad"}, result);
    }
}


//return result.toArray(new String[result.size()]);  // ArrayList<String> result = new ArrayList<>();