package com.javarush.level6;

//Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
//Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
//Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
//Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
//Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int first = 0;
        int second = 0;
        int even = 0;
        int odd = 0;

        if (number < 10) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (number >= 10 && number < 100) {
            first = number / 10;
            if (first % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            second = number%10;
            if (second % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("even: " + even + ", " + "odd: " + odd);

    }
}
