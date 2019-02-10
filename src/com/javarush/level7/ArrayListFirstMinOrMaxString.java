package com.javarush.level7;

//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListFirstMinOrMaxString {

    public static void main(String args[]) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringList = new ArrayList<String>();

//        int minLength = 0;
        int maxLength = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < 4; i++) {
            stringList.add(buff.readLine());

            if (stringList.get(i).length() < stringList.get(minIndex).length()) {
                minIndex = i;
            }

            if (stringList.get(i).length() > maxLength) {
                maxLength = stringList.get(i).length();
                maxIndex = i;
            }
        }

        int resultIndex = (minIndex < maxIndex) ? minIndex : maxIndex;

        System.out.println(stringList.get(resultIndex));
    }
}

