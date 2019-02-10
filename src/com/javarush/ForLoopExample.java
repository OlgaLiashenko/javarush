package com.javarush;

public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("start");

//        forLoopTwo();
//        System.out.println("another loop");
//        forLoopOne();
//        forLoopThree();
        forLoopArray();
    }

    public static void forLoopArray() {
        // создать массив целых чисел размером 10 единиц
        // в цикле проинициализировать этот массив цифрами соответственно 1-10
        int[] array = new int[10];
//        int a = 0;

        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
//            a = a+1;

        }

//        Arrays.asList(array).forEach((e)-> System.out.println(e));
        System.out.println();
    }

    public static void forLoopThree() {
        // не делиться на три и после каждого числа делящегося на пять выводить слово hello
        for (int i = 2; i <= 40; i = i + 2) {
            if ((i % 3) != 0) {
                System.out.println(i);
                if ((i % 5) == 0) {
                    System.out.println("hello");
                }
            }
        }
    }

    public static void forLoopTwo() {
        for (int i = 2; i < 21; i = i + 2) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void forLoopOne() {
        for (int i = 2; i < 11; i = i + 2) {
            System.out.println(i);
        }
    }
}
