package com.javarush.level7;

//1. Создать массив на 15 целых чисел.
//2. Ввести в него значения с клавиатуры.
//3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
//Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
//4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
//
//Примечание:
//дом с порядковым номером 0 считать четным.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Houses {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[15];
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < list.length; i = i+ 2){
            sumEven += list[i];
        }

        for (int i = 1; i < list.length; i = i +2){
            sumOdd += list[i];
        }

        if (sumEven>= sumOdd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}


//5
//10
//16
//17
//9
//3
//4
//46
//97
//12
//45
//42
//98
//98
//71