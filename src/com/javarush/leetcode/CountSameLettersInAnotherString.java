package com.javarush.leetcode;
//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
// Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
// so "a" is considered a different type of stone from "A".
//S and J will consist of letters and have length at most 50.
//The characters in J are distinct.
//Example 1:
//Input: J = "aA", S = "aAAbbbb"
//Output: 3

public class CountSameLettersInAnotherString {
    public int numJewelsInStones(String J, String S) {
        J = "AaZh";
        S = "nsAzhaa";
        int count = 0;
        for (char letter : J.toCharArray()) {
            for (char input : S.toCharArray()) {
                if (letter == input) {
                    count++;
                }
            }
        }


        return count;
    }
}
