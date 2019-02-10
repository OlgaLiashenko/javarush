package com.javarush.level7;

//1. Создай список строк.
//2. Добавь в него 5 строк с клавиатуры.
//3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
//4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDeleteAndAdd {
    public static void main(String args[]) throws Exception {
        BufferedReader buffArray = new BufferedReader(new InputStreamReader(System.in));
        List<String> lists = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            lists.add(buffArray.readLine());
        }

        for (int i = 0; i < 13; i++) {
            lists.add(0, lists.remove(lists.size()-1));
        }

        for (String a : lists) {
            System.out.println(a);
        }
    }
}

//list.size() не даёт последний индекс массива, а возвращает РАЗМЕР массива. То-есть если размер 13 (массив состоит из 13 ячеек), то индекс последней ячейки будет 12, так как первая ячейка массива имеет индекс ноль.
//                                                 1 2 3 4 5 6 7 8 9 10 11 12 13 <-- размер массива - list.size()
//                                   индекс:  0 1 2 3 4 5 6 7 8  9  10 11 12 <-- последний индекс - list.size() - 1