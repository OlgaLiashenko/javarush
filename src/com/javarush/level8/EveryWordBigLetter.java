package com.javarush.level8;


//Написать метод, который принимает строку текста
//метод заменяет в тексте первые буквы всех слов на заглавные.
//возвращает строку с результатом.


import org.junit.Assert;
import org.junit.Test;

public class EveryWordBigLetter {
    public static String replaceFirstLetterToUppercase(String input) {
        if (input == null) {
//            throw new Exception("incorrect input");
            //or
            return null;
        }
        if (input.equals("")) {
            return "";
        }

        String[] arrayOfWords = input.split(" ");
        String result = "";
        for (int i = 0; i < arrayOfWords.length; i++) {
            String word = arrayOfWords[i];
            if (!word.equals("")) {
                result = result + Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            if (i != arrayOfWords.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }

    @Test
    public void checkReplaceFirstLetterToUppercase() {
        //given
        String input = "My sister loves coffee";

        //when
        String result = replaceFirstLetterToUppercase(input);

        //then
        Assert.assertEquals("No all of words are from big letter.", "My Sister Loves Coffee", result);
    }

    @Test
    public void checkWithOneWord() {
        //given
        String input = "cat";

        //when
        String result = replaceFirstLetterToUppercase(input);

        //then
        Assert.assertEquals("Word is not capitalized", "Cat", result);
    }

    @Test
    public void checkOneCapitalizedLetterWord() {
        //given
        String input = "A";

        //when
        String result = replaceFirstLetterToUppercase(input);

        //then
        Assert.assertEquals("Word is not capitalizes", "A", result);
    }

    @Test
    public void emptyString() {
        //given
        String input = "";

        //when
        String result = replaceFirstLetterToUppercase(input);

        //then
        Assert.assertEquals("Should return empty string", "", result);
    }

    @Test
    public void nullString() {
        Assert.assertEquals("Should return null", null, replaceFirstLetterToUppercase(null));
        // Assert.assertNull("Should return null", replaceFirstLetterToUppercase(null));
    }

    @Test
    public void multipleSpaces() {
        Assert.assertEquals("Return capitalized words",
                "Happy  Birthday", replaceFirstLetterToUppercase("happy  birthday"));
    }

    @Test
    public void spacesAtBegginningAndEndOfString() {
        Assert.assertEquals("Return capitalized words", " Cat Says Mau ", replaceFirstLetterToUppercase(" cat says mau "));
    }
}
