package com.javarush.level8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Реализовать 4 метода.
//Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций
// (быстрее всего справится с большим количеством операций).

public class IsQuicker {
    public static List getListForGet() {
     //   ArrayList<String> arrayList = new ArrayList<>();
     //   return arrayList;
        return new ArrayList<String>();
    }

    public static List getListForSet() {
        return new ArrayList<String>();
    }

    public static List getListForAddOrInsert() {
        return new LinkedList<String>();
       // LinkedList<String> linkedList = new LinkedList<>();
       // return linkedList;
    }

    public static List getListForRemove() {
        return new LinkedList<String>();
    }

    public static void main(String[] args) {

    }
}
