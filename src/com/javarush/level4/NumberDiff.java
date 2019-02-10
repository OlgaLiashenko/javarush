package com.javarush.level4;


import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
// Вывести на экран порядковый номер числа, отличного от остальных.
public class NumberDiff {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b)
            System.out.println("3");
        if (a == c)
            System.out.println("2");
        if (b == c)
            System.out.println("1");
    }
}

