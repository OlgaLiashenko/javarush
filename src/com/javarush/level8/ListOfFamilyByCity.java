package com.javarush.level8;
//Программа определяет, какая семья (фамилию) живёт в указанным городе.

import java.util.HashMap;
import java.util.Map;

public class ListOfFamilyByCity {
    public static void main(String[] args) {

        Map<String, String> cityFamily = new HashMap<>();
        cityFamily.put("London", "Liashenko");
        cityFamily.put("NY", "Kovalchyk");
        String city = "London";
        System.out.println(cityFamily.get(city));
    }

    public static String getFamily(String city, Map<String, String> cityFamily) {

        return cityFamily.get(city);
    }
}

