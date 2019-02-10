package com.javarush.level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
//Вывести на экран полученную сумму.
public class Summa {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summaCount = 0;
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            }
            int a = Integer.parseInt(s);
            summaCount = summaCount + a;
        }
        System.out.println(summaCount);
    }
}
