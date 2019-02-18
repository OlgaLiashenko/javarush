package com.javarush.level9;
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:

public class ExceptionNullPointerExceptionExample {
    public static void main(String[] args) throws Exception {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException exception) {
            System.out.println(exception);
        }
    }
}
