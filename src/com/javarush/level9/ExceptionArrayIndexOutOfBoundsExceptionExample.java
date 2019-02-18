package com.javarush.level9;

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
public class ExceptionArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) throws Exception {
        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getClass());
        }
    }
}
