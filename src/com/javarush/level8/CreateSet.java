package com.javarush.level8;

//Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
//•	Метод createSet() должен создавать и возвращать множество (реализация HashSet).

import java.util.HashSet;
import java.util.Set;

public class CreateSet {
    public static Set<String> createSet() {
        Set<String> setList = new HashSet<String>();
            setList.add("Lola");
            setList.add("loves");
            setList.add("lemonade");

            return setList;
    }

    public static void main(String[] args) {

    }
}
