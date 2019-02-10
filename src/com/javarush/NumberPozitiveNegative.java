package com.javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел.
public class NumberPozitiveNegative {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int j = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());



      /*  int pozitive = 0;
        int negative = 0;
        if (a < 0) {
            negative++;
        }
        if (a > 0) {
            pozitive++;
        }
        if (b < 0) {
            negative++;
        }
        if (b > 0) {
            pozitive++;
        }
        if (c < 0) {
            negative++;
        }
        if (c > 0) {
            pozitive++;
        }
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел:  " + pozitive); */


        int a;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++) {
            a = Integer.parseInt(reader.readLine());
            if (a > 0) {
                x++;
            }
            if (a < 0) {
                y++;
            }
        }
        System.out.println("количество положительных чисел: " + x);
        System.out.println("количество отрицательных чисел: " + y);

    }
}
