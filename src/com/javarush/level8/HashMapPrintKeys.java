package com.javarush.level8;
//Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
//Вывести на экран список ключей, каждый элемент с новой строки.

import java.util.HashMap;
import java.util.Map;

public class HashMapPrintKeys {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //1 способ
        for(String key : map.keySet()){
            System.out.println(key);
        }

        //2 способ
        for(Map.Entry<String, String> key : map.entrySet()){
            System.out.println(key.getKey());
        }
    }
}
