package com.javarush.level9;

//Перехватить исключение, возникающее при выполнении кода:
//int a = 42 / 0;
//Вывести на экран тип перехваченного исключения.

public class ExceptionArithmeticExample {
    public static void main(String[] args) throws Exception {

        try {
            int a = 42 / 0;
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }
    }
}
