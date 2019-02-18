package com.javarush.level9;
//Есть класс кот - Cat, с полем "имя" (String).
//Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
//Получить из Map множество(Set) всех котов и вывести его на экран.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapOfCats {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> hashMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            hashMap.put("CatName" + i, new Cat("name" + i));
        }
        return hashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
