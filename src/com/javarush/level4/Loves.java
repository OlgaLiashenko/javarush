package com.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
public class Loves {
    public static void main(String agrs[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + "loves tea.");
        }
    }
}
