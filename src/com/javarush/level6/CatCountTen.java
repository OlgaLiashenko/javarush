package com.javarush.level6;

//Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
// catCount увеличивается на 1. Создать n объектов Cat и вывести значение переменной catCount на экран.

public class CatCountTen {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat();
        Cat catThree = new Cat();
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;
        public Cat(){
            catCount++;
        }

    }
}
