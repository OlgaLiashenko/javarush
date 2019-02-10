package com.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
// Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
// Если имена и длины имен разные - ничего не выводить.
public class SameName {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        if (a.equals(b)) {
            System.out.println("Имена идентичны");
        } else if (a.length() == b.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
