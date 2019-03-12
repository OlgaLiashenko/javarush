package com.javarush.level10;
//Создать массив, элементами которого будут списки строк.
//Заполнить массив любыми данными и вывести их на экран.

import java.util.ArrayList;

public class ArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String>[] arrayStringList = createList();
        printArray(arrayStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] create = new ArrayList[3];
        for (int i = 0; i < create.length; i++) {
            create[i] = new ArrayList<>();
            create[i].add("hello" + i);
        }
        return create;
    }

    public static void printArray(ArrayList<String>[] arrayStringList) {
        for (ArrayList<String> list : arrayStringList) {
            for (String string : list) {
                System.out.println(string);
            }

        }
    }
}
