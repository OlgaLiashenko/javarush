package com.javarush.level9;

import java.util.HashMap;

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
public class ExceptionHashMapExample {
    public static void main(String[] args) throws Exception {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException exception) {
            System.out.println(exception.getClass());
        }
    }
}
