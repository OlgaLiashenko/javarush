package com.javarush.leetcode;

import org.junit.Assert;
import org.junit.Test;

//Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place,
// and all letters reverse their positions.
//Example 2:
//Input: "a-bC-dEf-ghIj"
//Output: "j-Ih-gfE-dCba"
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String input) {
        StringBuilder builder = new StringBuilder(input.length());
        String result = "";
        char[] letters = input.toCharArray();
        int indexRight = input.length();

        for (char chars : letters) {
            builder.append(chars);
        }

        result = builder.toString();
        return result;
    }


    /*
    public boolean isLetter(char letter) {
        return Character.toLowerCase(letter) >= 'a' && Character.toLowerCase(letter) <= 'z';
    }
    */

    @Test
    public void test1() {
        String input = "a-bC-dEf-ghIj";
        String result = reverseOnlyLetters(input);
        Assert.assertEquals("j-Ih-gfE-dCba", result);
    }

    @Test
    public void test2() {
        String input = "1234AB2";
        String result = reverseOnlyLetters(input);
        Assert.assertEquals("1234BA2", result);
    }


//     for (int i = 0; i < indexRight; i++) {
//        //   if ((input.toLowerCase().charAt(i) >= 'a' && input.toLowerCase().charAt(i) <= 'z')) {
//        if(Character.isLetter(letters[i])){
//
//            for (int j = indexRight - 1; j > i; j--) {
//                if (Character.isLetter(letters[j])) {
//                    indexRight = j;
//                    break;
//                }
//            }
//
//            char temp = letters[i];
//            letters[i] = letters[indexRight];
//            letters[indexRight] = temp;
//        }
//    }

}
