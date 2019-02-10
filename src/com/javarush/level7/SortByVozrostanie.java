package com.javarush.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

public class SortByVozrostanie {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Создаем массив  чисел
        int[] list = new int[5];

        //Вводим данные с клавиатуры.
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        //Сортируем массив
        Arrays.sort(list);

        //Выводим отсортированный массив на консоль.
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }
        for (int i : list) {
            System.out.println(i);
        }
    }
}
