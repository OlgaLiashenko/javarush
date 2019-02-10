package com.javarush.level4;

//Вывести на экран числа от 10 до 1 используя цикл while. Каждое значение с новой строки.
public class TenToOne {
    public static void main(String[] args) throws Exception {
        int a = 10;
        while (a > 0) {
            System.out.println(a);
            a--;
        }
    }
}
