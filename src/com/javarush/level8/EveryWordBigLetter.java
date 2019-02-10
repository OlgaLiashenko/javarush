package com.javarush.level8;


//Написать метод, который принимает строку текста
//метод заменяет в тексте первые буквы всех слов на заглавные.
//возвращает строку с результатом.


import org.junit.Assert;
import org.junit.Test;

public class EveryWordBigLetter {
    public static String replaceFirstLetterToUppercase(String input) {


        return null;
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


}
