package com.javarush.level4;

//Ввести с клавиатуры два числа m и n.
//Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

public class Priamougolnik {
    public static void main(String args[]) throws Exception {
        int m = 3;
        int n = 5;

        for (int i = 0; i < m; i++) {
            for (int a = 0; a < n; a++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
