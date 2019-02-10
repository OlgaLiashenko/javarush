package com.javarush.level7;

//Ввести с клавиатуры 2 числа N и M.
//Ввести N строк и заполнить ими список.
//Переставить M первых строк в конец списка.
//Вывести список на экран, каждое значение с новой строки.
//Примечание: запрещено создавать больше одного списка.
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
//•	Переставить M первых строк в конец списка.
//•	Выведи список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListStringsNtimesReverse {
    public static void main(String[] args) throws  Exception{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();

        int numberN = Integer.parseInt(buff.readLine());
        int numberM = Integer.parseInt(buff.readLine());

        for(int i = 0; i < numberN; i++){
            strings.add(buff.readLine());
        }

        for (int i = 0; i<numberM; i++){
            strings.add(strings.remove(0));

          //  strings.add(strings.get(0));
          //  strings.remove(0);
        }

        strings.forEach(System.out::println);



    }
}
