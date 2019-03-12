package com.javarush.level10;
//Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для маленьких букв алфавита).
// Результат вывести на экран в алфавитном порядке.

import java.util.ArrayList;
import java.util.List;

public class AlphabetLettersCountOptionOne {
    public static void main(String[] args) {
        String abc = "abcdefghijklmnopqrstuvwxyz";

        List<String> input = new ArrayList<>();
        input.add("Aapple");
        input.add("Pear");
        input.add("Coffee");
        input.add("tea");
        input.add("noise");
        input.add("music");

        int[] letterCounter = new int[200];

        for (String word : input) {
            for (char c : word.toLowerCase().toCharArray()) {
                letterCounter[(int) c] = letterCounter[(int) c] + 1;
            }
        }

        for (char c : abc.toCharArray()) {
            System.out.println("letter " + c + " " + letterCounter[c]);
        }
//        for (int i = 1; i < letterCounter.length; i++) {
//            System.out.println("letter " + Character.getName(i) +" '" + (char)i + "' " + letterCounter[i]);
//        }
    }
}
