package com.javarush.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//Программа выводит содержимое нового списка на экран.

public class ArrayListStringRepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        String s = reader.readLine();

        while (!s.isEmpty()) {
            list.add(s);
            s = reader.readLine();
        }

        ArrayList<String> listRepeat = new ArrayList<String>();
        for (String string : list) {
            if (string.length() % 2 == 0) {
                listRepeat.add(string + " " + string);
            } else {
                listRepeat.add(string + " " + string + " " + string);
            }
        }

        for (String repeat : listRepeat) {
            System.out.println(repeat);
        }
    }
}
