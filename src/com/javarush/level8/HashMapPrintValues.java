package com.javarush.level8;
//Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
//Вывести на экран список значений, каждый элемент с новой строки.

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPrintValues {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("SimK", "simV");
        map.put("TomK", "Tom1");
        map.put("TomK", "Tom2"); //If the map previously contained a mapping for the key, the old value is replaced.
        map.put("ArbusK", "Arbus");
        map.put("BabyK", "Baby");
        map.put("CatK", "sim");
        map.put("DogK", "Dog");
        map.put("EatK", "Eat");
        map.put("FoodK", "Food");
        map.put("GeveyK", "Gevey");
        map.put("HugsK", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {

        Set<String> keyset = map.keySet();
        for (String key : keyset) {
            System.out.println(key + " " + map.get(key)); //map.get(key) - возвращает значение, которое соотв. этому ключу
        }

        Collection<String> valuesCol = map.values();
        for (String value : valuesCol) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> values : map.entrySet()) {
            System.out.println(values.getKey() + " " + values.getValue());
        }
    }
}
