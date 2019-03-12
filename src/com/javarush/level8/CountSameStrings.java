package com.javarush.level8;

//Ввести с клавиатуры в список 20 слов.
//Нужно подсчитать сколько раз каждое слово встречается в списке.
//Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число, сколько раз данное слово встречалось в списке.
//Вывести содержимое словаря на экран.
//В тестах регистр (большая/маленькая буква) влияет на результат.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountSameStrings {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            words.add("word" + i);
        }
        words.add("word1");
        words.add("word1");
        words.add("word1");

        HashMap<String, Integer> map = countStrings(words);

        for (Map.Entry<String, Integer> output : map.entrySet()) {
            System.out.println(output.getKey() + " " + output.getValue());
        }
    }

    public static HashMap<String, Integer> countStrings(ArrayList<String> list) {

        HashMap<String, Integer> resultMap = new HashMap<>();
        for (String input : list) {
            resultMap.put(input, 0);
        }

        for (String string : list) {
            if (!resultMap.keySet().contains(string)) {
                resultMap.put(string, 1);
            }
            if (resultMap.keySet().contains(string)) {
                int temp = resultMap.get(string);
                resultMap.put(string, (temp + 1));
            }
        }

        return resultMap;
    }
}
