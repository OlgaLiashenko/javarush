package com.javarush.level5;

//Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinOfTwo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
