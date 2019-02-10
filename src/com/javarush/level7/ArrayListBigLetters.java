package com.javarush.level7;

//Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
// Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListBigLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        String s = reader.readLine();

        while (!s.isEmpty()) {
            list.add(s);
            s = reader.readLine();
        }

//        List<String> listUpperCaseWithLambda = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (String string : list) {
            listUpperCase.add(string.toUpperCase());
        }

        for (String upperString : listUpperCase) {
            System.out.println(upperString);
        }
    }
}

