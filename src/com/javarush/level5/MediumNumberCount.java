package com.javarush.level5;

//Вводить с клавиатуры числа и вычислить среднее арифметическое.
//Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
//-1 не должно учитываться.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MediumNumberCount {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double medium=0;
        int count = 0;
        double summ = 0;

        while (true) {
            double a = Integer.parseInt(reader.readLine());
            if (a == -1) {
                break;
            }
            count++;
            summ = summ + a;
            medium = (summ / count);
        }
        System.out.println(medium);
    }
}
