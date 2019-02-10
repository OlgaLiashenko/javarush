package com.javarush.level7;

//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую короткую строку в списке.
//4. Выведи найденную строку на экран.
//5. Если таких строк несколько, выведи каждую с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMinStringLength {

    public static void main(String args[]) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringList = new ArrayList<String>();

        int minLength = 0;

        for (int i = 0; i < 5; i++) {
            stringList.add(buff.readLine());

            if (stringList.get(i).length() <= minLength || minLength == 0) {
                minLength = stringList.get(i).length();
            }
        }

        for (String string : stringList) {
            if (string.length() == minLength) {
                System.out.println(string);
            }
        }
    }
}
