package com.javarush.level7;


//Создать список строк.
//Ввести строки с клавиатуры и добавить их в список.
//Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
//Вывести строки на экран, каждую с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListTillEnd {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();

//        for (int i = 0; i < 100; i++) {
//
//            String input = buff.readLine();
//            if(input.equals("end")){
//                break;
//            }
//            strings.add(input);
//        }

        String input = buff.readLine();

        while (!input.equals("end")) {
            strings.add(input);
            input = buff.readLine();
        }

        for (String string : strings) {
            System.out.println(string);
        }

    }
}