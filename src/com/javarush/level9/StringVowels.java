package com.javarush.level9;

//Написать программу, которая вводит с клавиатуры строку текста.
//Программа должна вывести на экран две строки:
//1. первая строка содержит только гласные буквы из введённой строки.
//2. вторая - только согласные буквы и знаки препинания из введённой строки.
//Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

public class StringVowels {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) throws Exception {
        String input = "In vino veritas, in aqua sanitas.";

        StringBuilder isVowelChar = new StringBuilder();
        StringBuilder notVowelChar = new StringBuilder();

        for (char a : input.toCharArray()) {
            if (a == ' ') {
                continue;
            }
            if (isVowel(a)) {
                isVowelChar.append(a).append(" ");
            } else {
                notVowelChar.append(a).append(" ");
            }
        }
        System.out.println(isVowelChar);
        System.out.println(notVowelChar);
    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);

        for (char letter : vowels) {
            if (character == letter) {
                return true;
            }
        }
        return false;
    }
}
