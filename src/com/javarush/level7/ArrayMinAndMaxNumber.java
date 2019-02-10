package com.javarush.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.

public class ArrayMinAndMaxNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            String numbers = buff.readLine();
            array[i] = Integer.parseInt(numbers);
        }

//        int maximum = Arrays.stream(array).max().orElse(0);
//        int minimum = Arrays.stream(array).min().orElse(0);
//        System.out.println(maximum + " " + minimum);

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

//        Arrays.sort(array);
//
//        int min = array[0];
//        int max = array[array.length - 1];

        System.out.println(min + " " + max);
    }
}
