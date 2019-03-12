package com.javarush.level10;
//Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
//Пояснение:
//Самое минимальное число - 1-е минимальное.
//Следующее минимальное после него - 2-е минимальное

public class MinInArray {
    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        sort(array);

        for (int number : array) {
            System.out.println(number);
        }
        try {
            System.out.println("Min number with index[9] is: " + array[9] + ", Min number with index[10] is: " + array[10]);
        } catch (Exception e) {
            System.out.println(e.getClass() + " Incorrect index of array.");
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }
}
