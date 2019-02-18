package com.javarush.level9;

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
public class ExceptionNumberFormatExceptionExample {
    public static void main(String[] args) throws Exception {
        try {
            int number = Integer.parseInt("hello");
            System.out.println(number);
        } catch (NumberFormatException exception) {
            System.out.println(exception);
        }
    }
}
