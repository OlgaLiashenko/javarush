package com.javarush.level8;

//1. Ввести с клавиатуры число N.
//2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//3. Найти минимальное число среди элементов списка - метод getMinimum.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;

public class ListMinNumber {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
       array.sort(Comparator.naturalOrder());
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNumberStrings =  Integer.parseInt(reader.readLine());

        int array[] = new int[numberOfNumberStrings];
        for(int i=0; i<numberOfNumberStrings; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        return null;
    }
}
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    int num = Integer.parseInt(reader.readLine());