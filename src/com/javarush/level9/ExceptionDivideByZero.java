package com.javarush.level9;
//Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
//Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()

public class ExceptionDivideByZero {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void divideByZero() {
        int result = 42 / 0;
        System.out.println(result);
    }

}
