package com.javarush.level9;
//Написать пять методов, которые вызывают друг друга.
//Метод должен вернуть номер строки кода, из которого вызвали этот метод.
//	Для получения номера строки, используй метод getLineNumber класса StackTraceElement.
//Воспользуйся функцией: element.getLineNumber().


public class StackTraceGetLineNumber {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  /*напишите тут ваш код*/ 0;
    }

    public static int method5() {
        return  /*напишите тут ваш код*/ 0;
    }
}
