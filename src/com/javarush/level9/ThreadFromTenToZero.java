package com.javarush.level9;
//Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
//Обернуть вызов sleep в try..catch.

public class ThreadFromTenToZero {
    public static void main(String[] args) {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}
