package com.javarush.level7;

//1. Создать массив на 10 строк.
//2. Создать массив на 10 чисел.
//3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
//Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringLength {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] mass = new int[10];

        for(int i = 0; i < list.length; i++){
            list[i] = reader.readLine();
            mass[i] = list[i].length();
        }

        System.out.println(Arrays.toString(mass));
    }
}

//дедушка
//бабушка
//папа
//мама
//сын
//дочь
//кот
//собака
//программа
//машина