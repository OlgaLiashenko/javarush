package com.javarush.level10;
//Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
// помещает их в HashMap и выводит на экран содержимое HashMap.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapPutFromKeyboard {
    static Integer index;
    static String name;
    HashMap<Integer, String> map;

    public HashMapPutFromKeyboard() {
        this.map = new HashMap<Integer, String>();
    }

    public static void main(String[] args) throws IOException {
        HashMapPutFromKeyboard solution = new HashMapPutFromKeyboard();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
//1
//Строка1
//2
//Строка2
//3
//Строка3
//4
//Строка4
//5
//Строка5
//6
//Строка6
//7
//Строка7
//8
//Строка8
//9
//Строка9
//10
//Строка10