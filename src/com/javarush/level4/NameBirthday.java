package com.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры строку name.
//Ввести с клавиатуры дату рождения (три числа): y, m, d.
public class NameBirthday {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int day = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int year = Integer.parseInt(reader.readLine());

        System.out.println("My name is "+name);
        System.out.println("I was born "+day+"."+month+"."+year);
    }
}
