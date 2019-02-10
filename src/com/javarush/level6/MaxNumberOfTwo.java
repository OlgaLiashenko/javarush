package com.javarush.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".

public class MaxNumberOfTwo {
    public static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String m = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;

        System.out.println(m + max);
    }
}
