package com.javarush.level8;
//Создать массив на 20 чисел.
//Заполнить его числами.
//Вывести пять наибольших чисел.
//Каждое значение с новой строки.

import org.junit.Assert;
import org.junit.Test;

public class ArrayFiveMaxNumbers {
//    public static void main(String args[]) {
//        int[] numbersArray = new int[]{2, 5, -1, 16, 90, 56, 14, 33, 54, 11};

    public static int[] fiveMaxNumbers(int[] numbersArray) {
        sort(numbersArray);

        int[] result = new int[5];

//        with array.sort()
//        for (int i = numbersArray.length - 1, j = 0; (i >= 0 && j<5); i--,j++) {
//            result[j] = numbersArray[i];
//        }

        for (int i = 0; (i < 5) && (i < numbersArray.length); i++) {
            result[i] = numbersArray[i];
        }
        return result;

        //  a    &&   b
        //  true && true  -> true
        //  true && false -> false
        // false && true  -> false
        // false && false -> false
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

//        Arrays.sort(arr);
    }


    @Test
    public void checkFiveNumbersInDescOrder() {
        //given
        int[] input = {3, 55, 63, 12, 90, 10, 30, 2};

        //when
        int[] result = fiveMaxNumbers(input);

        //then
        Assert.assertArrayEquals("Print five max numbers from array in descending order", new int[]{90, 63, 55, 30, 12}, result);
    }

    @Test
    public void checkThreeNumbersArray() {
        //given
        int[] input = {4, 22, 11};

        //when
        int[] result = fiveMaxNumbers(input);

        //then
        Assert.assertArrayEquals("Only three numbers in array.", new int[]{22, 11, 4, 0, 0}, result);
    }
}