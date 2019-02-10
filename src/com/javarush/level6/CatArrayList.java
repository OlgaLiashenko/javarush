package com.javarush.level6;

import java.util.ArrayList;


//1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
//2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
//3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
//Требования:
//•	Добавь в класс Cat публичную статическую переменную cats (ArrayList<Cat>).
//•	Переменная cats должна быть проинициализирована.
//•	Метод main должен создавать 10 объектов Cat (используй конструктор Cat()).
//•	Метод main должен добавить всех созданных котов в переменную cats.
//•	Метод printCats должен выводить всех котов из переменной cats на экран. Каждого с новой строки.


public class CatArrayList {
    public static ArrayList<CatArrayList> cats = new ArrayList<CatArrayList>();

    public CatArrayList() {
        CatArrayList.cats.add(this);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
        // cats.forEach(System.out::println);
    }
}

