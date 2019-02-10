package com.javarush.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

public class ArraySortReverse {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        //bubble sort
        //внешний цикл - это сколько раз мы проходимся по массиву
        for (int i = 0; i < array.length - 1; i++) {  // -1 так как последний элемент не с чем сравнивать, он итак самый большой
            //сравниваем соседние числа в массиве
            //после каждой итерации цикла самый большой элемент передвигается на последнее место
            //выходит упорядоченный с конца массив
            for (int a = 0; a < array.length - 1 - i; a++) {
                if (array[a] < array[a + 1]) {
                    // swap arr[a+1] and arr[a]
                    int temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                }
            }
        }

    }
}

/*5
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
98
98
-9
71
-150
*/