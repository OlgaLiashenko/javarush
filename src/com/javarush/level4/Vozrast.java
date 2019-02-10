package com.javarush.level4;


import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
public class Vozrast {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
