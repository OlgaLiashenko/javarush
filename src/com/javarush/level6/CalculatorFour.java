package com.javarush.level6;


//Сделать класс Calculator, у которого будут 5 статических методов:
//int plus(int a, int b) - возвращает сумму чисел a и b
//int minus(int a, int b) - возвращает разницу чисел a и b
//int multiply(int a, int b) - возвращает результат умножения числа a на число b
//double division(int a, int b) - возвращает результат деления числа a на число b
//double percent(int a, int b) - возвращает b процентов из числа a

public class CalculatorFour {
    public static int plus(int a, int b) {
        return a+b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return a / b;
    }

    public static double percent(int a, int b) {
        return b*a/100;
    }

    public static void main(String[] args) {
        System.out.println(CalculatorFour.multiply(3,4));
        System.out.println(CalculatorFour.percent(20, 100));
        System.out.println(CalculatorFour.division(10,8));
        System.out.println(CalculatorFour.minus(4,7));
    }
}
