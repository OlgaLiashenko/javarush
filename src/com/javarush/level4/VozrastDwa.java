package com.javarush.level4;


import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
public class VozrastDwa {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
