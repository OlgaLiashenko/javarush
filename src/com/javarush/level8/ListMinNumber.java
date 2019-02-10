package com.javarush.level8;

//1. Ввести с клавиатуры число N.
//2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//3. Найти минимальное число среди элементов списка - метод getMinimum.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListMinNumber {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        // return Collections.min(list, Comparator.naturalOrder());
        if (list.size() == 0) {
            return 0;
        }
        int min = list.get(0);
        for (Integer number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNumberStrings = Integer.parseInt(reader.readLine());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numberOfNumberStrings; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        return numbers;
    }
}
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    int num = Integer.parseInt(reader.readLine());