package com.javarush.level7;

//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Порядок объявления списков очень важен.
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDevideTwoThree {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            String numbers = reader.readLine();
            listNumbers.add(Integer.parseInt(numbers));
        }

        ArrayList<Integer> devideToThree = new ArrayList<Integer>();
        ArrayList<Integer> devideToTwo = new ArrayList<Integer>();
        ArrayList<Integer> otherNumbers = new ArrayList<Integer>();

        for (Integer a : listNumbers) {
            if (a % 2 == 0) {
                devideToTwo.add(a);
            }
            if (a % 3 == 0) {
                devideToThree.add(a);
            }
            if ((a % 2 != 0) && (a % 3 != 0)) {
                otherNumbers.add(a);
            }
        }
        printList(devideToThree);
        printList(devideToTwo);
        printList(otherNumbers);
    }

    public static void printList(List<Integer> list) {
        list.forEach(System.out::println);
//        for (Integer number : list) {
//            System.out.println(number);
//        }
    }
}

/*
5
10
16
17
9
3
4
46
97
89
12
45
98
111
42
99
98
9
71
150
 */