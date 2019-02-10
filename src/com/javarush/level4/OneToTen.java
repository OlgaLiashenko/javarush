package com.javarush.level4;

//Вывести на экран числа от 1 до 10 используя цикл while. Каждое значение с новой строки.
public class OneToTen {
    public static void main(String[] args) throws Exception {
        int a = 1;
        while (a < 11) {
            System.out.println(a);
            a ++;
        }
    }
}
