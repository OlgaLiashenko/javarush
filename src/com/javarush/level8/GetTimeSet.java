package com.javarush.level8;

//Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
//Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GetTimeSet {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        //ArrayList<Object> list = new ArrayList<>();
        //List newList = fill(list);
        //getGetTimeInMs(newList);

        // ArrayList<Object> list = new ArrayList<>();
        //        fill(list);
        //        getGetTimeInMs(list);


        System.out.println(getGetTimeInMs(fill(new LinkedList())));


    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;  // fill заполнили, вернулись наверх к (getGetTimeInMs(fill(new ArrayList()))); и далее вызываем getGetTimeInMs
    }

    public static long getGetTimeInMs(List list) {
        long timeStart = System.currentTimeMillis();
        Date startTime = new Date();
        get10000(list);
        Date finishTime = new Date();
        long timeFinish = System.currentTimeMillis();
        return finishTime.getTime() - startTime.getTime();
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2; // =500 средний элемент

        for (int i = 0; i < 10000; i++) {
            list.get(x); //10000 раз берем элемент из середины

            //Это для демонстрации фундаментального отличия списков ArrayList и LinkedList.
            //В первом случае обращение к каждому элементу осуществляется по индексу (будь то 5-ый, 50-ый или 5000-ый элемент),
            // поэтому метод .get(); срабатывает моментально. Во втором случае элементы списка не имеют индекса,
            // но имеют ссылки на соседние элементы. Таким образом, для извлечения необходимого элемента из списка
            // приходится перебирать все элементы до необходимого, при этом, как я понимаю, перебор может начинаться
            // как с конца, так и с начала списка (соответственно, максимальное время перебора будет ближе к середине).
        }
    }
}


