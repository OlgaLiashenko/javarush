package com.javarush.level7;

//Объяви переменную типа список целых чисел и сразу проинициализируй ee.
//Ввести с клавиатуры 10 чисел и заполнить ими список.
//Вывести их в обратном порядке. Каждый элемент - с новой строки.
//Использовать только цикл for.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListNumbersReverse {
    public static void main(String args[]) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> listNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++)
            listNumbers.add(0, Integer.parseInt(buff.readLine()));

        for (Integer number : listNumbers) {
            System.out.println(number);
        }
    }
}
