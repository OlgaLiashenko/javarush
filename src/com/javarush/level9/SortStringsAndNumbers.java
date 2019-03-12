package com.javarush.level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Задача: Пользователь вводит с клавиатуры список слов (и чисел).
//Слова вывести в возрастающем порядке, числа - в убывающем.
//Пример ввода:
//Вишня
//1
//Боб
//3
//Яблоко
//22

public class SortStringsAndNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
//        while (true) {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            list.add(s);
//        }

        list.add("wine");
        list.add("2");
        list.add("11");
        list.add("test");
        list.add("1231");
        list.add("3");
        list.add("apple");

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String temp = "";

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (isGreaterThan(array[j], array[j + 1])) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        if (isNumber(a) & !isNumber(b)) {
            return false;
        } else if (!isNumber(a) && isNumber(b)) {
            return true;
        } else if (isNumber(a) && isNumber(b)) {
            return Integer.valueOf(a) < Integer.valueOf(b);
        }
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
