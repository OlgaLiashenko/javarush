package com.javarush.level8;
//Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
//Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

import java.util.HashMap;

public class HashMapNameSurname {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> nameSurname = new HashMap<String, String>();
        nameSurname.put("Chaikovska", "Olga");
        nameSurname.put("Liashenkoooo", "Olga");
        nameSurname.put("Liashenko", "Iaroslav");
        nameSurname.put("Petrova", "Olga");
        return nameSurname;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countNames = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                countNames++;
            }
        }
        return countNames;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
//        int countLasNames = 0;
//        for (String key : map.keySet()) {
//            if (key.equals(lastName)) {
//                countLasNames++;
//            }
//        }
        //   return countLasNames;

        return (map.get(lastName) == null) ? 0 : 1;
//        return (map.containsKey(lastName)) ? 1 : 0;
    }

    public static void main(String[] args) {
        // 1 option
        HashMap<String, String> map = createMap();
        String searchedName = "Olga";
        String searchedLastName = "Petrova";

        int howManyNames = getCountTheSameFirstName(map, searchedName);
        System.out.println(howManyNames);
        int howManyLastNames = getCountTheSameLastName(map, searchedLastName);
        System.out.println(howManyLastNames);

        // 2 option
        System.out.println(getCountTheSameFirstName(createMap(), "Olga"));
        System.out.println(getCountTheSameLastName(createMap(), "Petrova"));
    }
}
