package com.javarush;


import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
public class NumberOcenki {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int pozitive = 0;
        if (a>0){
            pozitive++;
        }
        if (b>0){
            pozitive++;
        }
        if (c>0){
            pozitive++;
        }
        System.out.println(pozitive);
    }

}

