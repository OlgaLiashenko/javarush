package com.javarush.level8;
//1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//4. Вывести содержимое Map на экран.

import java.util.HashMap;
import java.util.Map;

public class HashMapSameKey {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Kravchuk", "Lesya");
        map.put("Liashenko", "Iaroslav");
        map.put("Liashenko", "Olga");
        map.put("Ivancehnko", "Oleg");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
