package com.javarush.level6;

//Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.

public class CatCount {
    static int catCount;

    public CatCount() {
        catCount++;
    }

    public static void main(String args[]) {
        System.out.println(catCount);
    }
}
