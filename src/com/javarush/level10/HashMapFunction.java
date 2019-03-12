package com.javarush.level10;
//Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
//Пустая строка - конец ввода данных.
//Числа могут повторяться.
//Строки всегда уникальны.
//Введенные данные не должны потеряться!
//Затем программа выводит содержание HashMap на экран.
//Каждую пару с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            try {
                String number = reader.readLine();
                if (number.isEmpty()) {
                    break;
                }
                int id = Integer.parseInt(number);
                String name = reader.readLine();
                map.put(name, id);
                if (name.isEmpty()) {
                    break;
                }

            } catch (NumberFormatException e) {
            }
        }

        for (Map.Entry<String, Integer> output : map.entrySet()) {
            System.out.println("ID " + output.getValue() + " " + "Name " + output.getKey());
        }
    }


}
