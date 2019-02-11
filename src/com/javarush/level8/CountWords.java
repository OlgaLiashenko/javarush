package com.javarush.level8;

import org.junit.Assert;
import org.junit.Test;

//get words from a sentence in java /  count number of words in a sentence in java
public class CountWords {

    public static int countNumbersInSentence(String input) {

        if (input == null || input.equals("")) {
            return 0;
        }

        String[] arrayOfWords = input.trim().split(" +"); //разделитель - у нас пробел, + это от 1 до любого кол-ва раз.

        return arrayOfWords.length;
    }


    @Test
    public void checkCount() {
        Assert.assertEquals("Count number of words in sentence", 5, countNumbersInSentence("get words from a sentence"));
    }

    @Test
    public void checkEmptyString() {
        Assert.assertEquals("Return 0", 0, countNumbersInSentence(""));
    }

    @Test
    public void checkTwoSpaces() {
        Assert.assertEquals("Input with two spaces in row", 2, countNumbersInSentence("The  cat."));
    }

    @Test
    public void checkTrailingSpace() {
        Assert.assertEquals("Input spaces in the beginning and in the end", 5, countNumbersInSentence(" My best Friend loves tea. "));
    }

    @Test
    public void checkNullString() {
        Assert.assertEquals("Check null string", 0, countNumbersInSentence(null));
    }

}


