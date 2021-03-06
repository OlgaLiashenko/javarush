package com.javarush.level8;

//Создать коллекцию HashMap<String, String>, занести туда 10 пар строк.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.

import java.util.HashMap;
import java.util.Map;

public class HashMapStrings {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");
        map.put("дыня", "овощ");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
