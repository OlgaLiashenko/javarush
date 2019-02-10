package com.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Вводить с клавиатуры числа.
//Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//-1 должно учитываться в сумме.
public class SumNumb {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countSum = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            countSum += number; //countSum = countSum + number;
            if (number == -1) {
                break;
            }
        }
        System.out.println(countSum);
    }
}
