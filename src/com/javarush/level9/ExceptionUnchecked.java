package com.javarush.level9;
//В методе handleExceptions обработайте все unchecked исключения.
//Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
//Можно использовать только один блок try..catch

public class ExceptionUnchecked {
    public static void main(String[] args) {
        handleExceptions(new ExceptionUnchecked());
    }

    public static void handleExceptions(ExceptionUnchecked obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RuntimeException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        throwable.printStackTrace();
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
