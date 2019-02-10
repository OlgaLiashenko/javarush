package com.javarush.level8;

//1. Создай список чисел.
//2. Добавь в список 10 чисел с клавиатуры.
//3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListLongestSequence {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        int temp = 1;

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

//        if(numbers.isEmpty()){
//            System.out.println(0);
//            return;
//        }

        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i).equals(numbers.get(i + 1))) {
                count++;
            } else {
                if (count > temp) {
                    temp = count;
                }
                count = 1;
            }
        }

        int maxSequence = (count > temp) ? count : temp;
        System.out.println(maxSequence);
    }
}
