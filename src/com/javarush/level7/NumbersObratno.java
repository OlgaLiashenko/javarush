package com.javarush.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1. Создать массив на 10 чисел.
//2. Ввести с клавиатуры 10 чисел и записать их в массив.
//3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

public class NumbersObratno {
    public static void main(String args[]) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int[] massiv = new int[10];

        for(int i = 0; i < massiv.length; i++){
            String s = buff.readLine();
            massiv[i] = Integer.parseInt(s);
        }

        for( int a = massiv.length-1; a >=0; a--){
            System.out.println(massiv[a]);
        }
    }
}

//5
//10
//16
//17
//9
//3
//4
//46
//97
//89