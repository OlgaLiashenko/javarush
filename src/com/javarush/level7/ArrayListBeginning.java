package com.javarush.level7;

//1. Создай список строк в методе main.
//2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListBeginning {
    public static void main(String args[]) throws Exception {
        BufferedReader arrayList = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String s = arrayList.readLine();
            list.add(0, s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
