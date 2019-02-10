package com.javarush.level7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

public class ArrayMinMaxTestCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            lines.add(scanner.nextLine());
        }
        String max = Collections.max(lines, Comparator.comparing(String::length));
        String min = Collections.min(lines, Comparator.comparing(String::length));
        int result = lines.indexOf(max) > lines.indexOf(min) ? lines.indexOf(min) : lines.indexOf(max);
        System.out.println(lines.get(result));
    }
}
