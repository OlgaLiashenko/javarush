package com.javarush.level10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для маленьких букв алфавита).
// Результат вывести на экран в алфавитном порядке.

public class AlphabetLetterCountOptionTwo {
    public static void main(String[] args) {
        String abc = "abcdefghijklmnopqrstuvwxyz";


        List<String> input = new ArrayList<>();
        input.add("Aapple");
        input.add("Pear");
        input.add("Coffee");
        input.add("tea");
        input.add("noise");
        input.add("music");

//        List<String> inputCopy = toLowerCase(input);  //input = toLowerCase(input);

        Map<Character, Integer> countChars = new HashMap<>();

        for (char alphabet : abc.toCharArray()) {
            countChars.put(alphabet, 0);
        }

        for (String word : input) {
            for (char letter : word.toLowerCase().toCharArray()) {
                if (!countChars.keySet().contains(letter)) {
                    countChars.put(letter, 1);
                } else if (countChars.keySet().contains(letter)) {
                    int countTemp = countChars.get(letter);
                    countChars.put(letter, (countTemp + 1));
                }
            }
        }

        for (char searchedChar : abc.toCharArray()) {
            if (countChars.keySet().contains(searchedChar)) {
                System.out.println(searchedChar + " " + countChars.get(searchedChar));
            }
        }
    }

//    public static List<String> toLowerCase(List<String> input) {
//        List<String> result = new ArrayList<>();
//        for (String string : input) {
//            result.add(string.toLowerCase());
//        }
//        return result;
//    }
}

