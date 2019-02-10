package com.javarush.level4;

//Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
public class Treugolnik {
    public static void main(String args[]) throws Exception {

        String string = "";
        for (int i = 0; i < 10; i++) {
            string = string + 8;
            System.out.println(string);
        }


        long result = 0;
        for (int i = 0; i < 10; i++) {
            result = result * 10 + 8;
            System.out.println(result);
        }

    }


}
