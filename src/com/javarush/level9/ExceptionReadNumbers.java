package com.javarush.level9;
//Написать программу, которая будет вводить числа с клавиатуры.
//Код по чтению чисел с клавиатуры должен быть в методе readData.
//Код внутри readData обернуть в try..catch.
//Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
//Числа выводить с новой строки сохраняя порядок ввода.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExceptionReadNumbers {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> number = new ArrayList<>();
        try {
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                number.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            for (int numberList : number) {
                System.out.println(numberList);
            }
        } catch (IOException e) {

        }

    }
}
