package com.javarush.level5;

//Написать программу, которая:
//1. считывает с консоли число N, которое должно быть больше 0
//2. потом считывает N чисел с консоли
//3. выводит на экран максимальное из введенных N чисел.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int number = Integer.parseInt(reader.readLine());
        if (number <= 0) {
            return;
        }
        int maximum = Integer.parseInt(reader.readLine());

        for (int i = 1; i < number; i++) {
            int a = Integer.parseInt(reader.readLine());
            maximum = (a > maximum) ? a : maximum;
        }
        System.out.println(maximum);
    }


}
