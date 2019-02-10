package com.javarush.level7;

//1. Создай список из слов "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListStringAfterEachString {
    public static void main(String args[]) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringList = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            stringList.add(buff.readLine());
        }
        int length = stringList.size();

        for (int i = 1; i < length*2; i+=2) {
            stringList.add(i , "imenno");
        }
//        for (int i = 0; i < length; i++) {
//            stringList.add(i * 2 + 1, "imenno");
//        }
        for (String string : stringList) {
            System.out.println(string);
        }
    }
}
