package com.javarush.level11;

//Написать метод, который определяет, объект какого класса ему передали,
// и возвращает результат - одно значение из: "Корова", "Кит", "Собака", "Неизвестное животное".
public class PolymorphismAnimals {
    int a = 3; // 0011
    int b = 6; // 0110
    int c = a | b; // 0111
    int d = a & b; // 0010
    int e = a ^ b; // 0101

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }


    // 1010 = 0* 2^0 + 1 * 2^1 + 0 * 2^2 + 1 * 2^3  = 10
    // 0011 = 1* 2^0 + 1 * 2^1 = 3
    // 0100 = 2^3 = 8

    public static String getObjectType(Object o) {
        if (o instanceof Cow) {
            return "Корова";
        }
        if (o instanceof Dog) {
            return "Собака";
        }
        if (o instanceof Whale) {
            return "Кит";
        }
        return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }


}
