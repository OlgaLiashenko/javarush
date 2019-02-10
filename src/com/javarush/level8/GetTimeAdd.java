package com.javarush.level8;

//Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
//Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GetTimeAdd {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {

        Date currentTime = new Date();  //получаем текущую дату и время
        insert10000(list);
        Date nowTime = new Date(); //получаем новое текущее время
        return nowTime.getTime() - currentTime.getTime();  //вычисляем разницу
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 100000; i++) {
//            list.add(new Object());
//            list.add(0, new Object());
            list.add(list.size()/2, new Object());
        }
    }
}

