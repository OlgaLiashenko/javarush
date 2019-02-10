package com.javarush.level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Программа вводит 25 чисел с клавиатуры и выводит минимальное из них на экран.

public class MinOfFive {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfNumbers = 25;

        int minimum = Integer.parseInt(reader.readLine());

        for(int i=1; i<numberOfNumbers; i++){
            int next = Integer.parseInt(reader.readLine());
           minimum = (minimum < next) ? minimum : next;
        }

        System.out.println("Minimum = " + minimum);
    }
}
