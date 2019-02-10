package com.javarush.level8;

//Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyValuePair {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", 56L);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for(Map.Entry<String, Object> pairs : map.entrySet()){
            System.out.println(pairs.getKey() + " - " + pairs.getValue());
        }
    }
}