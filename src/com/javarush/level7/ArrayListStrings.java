package com.javarush.level7;

//1. Создай список строк.
//2. Добавь в него 5 различных строк.
//3. Выведи его размер на экран.
//4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

import java.util.ArrayList;

public class ArrayListStrings {
    public static void main(String[] args) throws Exception {
      ArrayList<String> list = new ArrayList<String>();
      list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.add("hello5");

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
