package com.javarush.level4;


//Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
//Каждое значение вывести с новой строки.

public class DevideTwo {
    public static void main(String[] args) throws Exception {

        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
        String s1 = "Я изучаю Java";
        String s2 = new String("Я изучаю Java");

        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(((Object) s2).hashCode());

        int a = 1;
//        int b = a++ + a * 2; // 1. a=1, a++(a=2)   2. (a)2*2 = 4  3. 1+4=5.
//        int b = a * 2 + a++;  // =3
//        int b =  a * 2 + ++a; //=4
//        int b = ++a + a * 2; //6
        int b = (((a++) * a) + (++a));  //5
        System.out.println(b);
    }
}
