package com.javarush.level8;

//Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDeleteNumbers {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i * 2 + 1);
        }
        return removeAllNumbersGreaterThan10(numbers);
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {

        Iterator <Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
