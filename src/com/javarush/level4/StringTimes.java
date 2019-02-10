package com.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры строку и число N.
//Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
public class StringTimes {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

      /*  while (number>0){
            System.out.println(string);
            number = number-1;
        } */

        while (true){
            System.out.println(string);
            number = number-1;
            if (number==0){
                break;
            }
        }
    }
}
