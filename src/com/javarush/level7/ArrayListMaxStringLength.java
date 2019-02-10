package com.javarush.level7;

//1. Создай список строк.
//	Инициализируй существующее поле strings класса ArrayListMaxStringLength новым ArrayList<>
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую длинную строку в списке.
//4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMaxStringLength {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader readerArray = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<String>();
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            String s = readerArray.readLine();
            strings.add(s);

            int maxLengthNext = s.length();
            maxLength = (maxLengthNext > maxLength) ? maxLengthNext : maxLength;

            /*
            if (strings.get(i).length() >= maxLength) {
                maxLength = strings.get(i).length();
            }
            */

        }
        // System.out.println(maxLength); // вывести кол-во символов в самой длинной строке

      /*  for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));
            }
        } */

        for (String oneString : strings){
            if (oneString.length() == maxLength )
            System.out.println(oneString);
        }
    }
}


