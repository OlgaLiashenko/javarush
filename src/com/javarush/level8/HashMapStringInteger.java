package com.javarush.level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
//Удалить из словаря всех людей, у которых зарплата ниже 500.

public class HashMapStringInteger {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> workers = new HashMap<>();
        workers.put("Ivanov", 1200);
        workers.put("Johnson", 700);
        workers.put("Sampson", 400);
        workers.put("Ronson", 350);
        workers.put("Donson", 450);
        workers.put("Apfellson", 550);
        workers.put("Dodson", 750);
        workers.put("Queryson", 420);
        workers.put("Fastenson", 300);
        workers.put("Nonson", 480);

        return workers;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> workersRemove = iterator.next();
            if (workersRemove.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        for (HashMap.Entry<String, Integer> mapItemAfterRemove : map.entrySet()) {
            System.out.println(mapItemAfterRemove);
        }

       // map.entrySet().forEach(System.out::println);
    }
}
