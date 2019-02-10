package com.javarush.level8;

import java.util.*;

//Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
//Удалить людей, имеющих одинаковые имена.
public class HashMapDeleteSameValues {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> people = new HashMap<>();
        people.put("Ivanov", "Ivan");
        people.put("Kovalev", "Ivan");
        people.put("Prok", "Alex");
        people.put("Liashenko", "Olga");
        people.put("Chaikovska", "Olga");
        people.put("Petrova", "Alona");

        return people;
    }

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     */
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, Integer> duplicate = new HashMap<>();
        for (String name : map.values()) {
            if (duplicate.get(name) != null) {  //duplicate.containsKey(name)
                duplicate.put(name, duplicate.get(name) + 1);
            }
            else {
                duplicate.put(name, 1);
            }
        }
        for (Map.Entry<String, Integer> entry: duplicate.entrySet()){
            if(entry.getValue()>1){
                removeItemFromMapByValue(map, entry.getKey());
            }

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> people = createMap();
        removeTheFirstNameDuplicates(people);
        System.out.println(people);
    }


//    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
//        HashMap<String, Integer> duplicatesMap = new HashMap<>();
//        for (String value : map.values()) {
//            if (duplicatesMap.containsKey(value)) {
//                duplicatesMap.put(value, duplicatesMap.get(value) + 1);
//            } else {
//                duplicatesMap.put(value, 1);
//            }
//        }
//
//        for (Map.Entry<String, Integer> pair : duplicatesMap.entrySet()) {
//            if (pair.getValue() > 1) {
//                removeItemFromMapByValue(map, pair.getKey());
//            }
//        }
//    }
}
