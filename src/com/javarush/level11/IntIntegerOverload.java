package com.javarush.level11;

//Написать два метода: print(int) и print(Integer).
//Написать такой код в методе main, чтобы вызвались они оба.
public class IntIntegerOverload {
    public static void main(String[] args) {

        print(5);
        print(new Integer(3));
        print((Integer) 2);
    }

    public static void print(int input) {
    }

    public static void print(Integer a) {
    }

}
