package com.javarush.level4;

//три числа, вывести на экран среднее из них.
//Если все числа равны, вывести любое из них.
public class MediumNumber {
    public static void main(String args[]) {
        int a = 4;
        int b = 3;
        int c = 2;

        int medium=(a+b+c)-(Math.max(Math.max(a,b),c)+Math.min(Math.min(a,b),c));
        System.out.println(medium);

     /*   int [] arr = new int [3];      // создаем массив
        arr [0] = 3;               // присваивам массиву введенное число.
        arr [1] = 4;               // присваивам массиву введенное число.
        arr [2] = 5;               // присваивам массиву введенное число.
        Arrays.sort(arr);               // сортируем массив по возрастанию.
        System.out.println(arr[1]);     // выводим второе число.
        */

      /*   if (a > b && a < c || a < b && a > c || a == c) {
            System.out.println(a);
        } else if (a < b && b < c || a > b && b > c || a == b||b==c) {
            System.out.println(b);
        } else if (a > c && b < c || a < c && b > c || a == b && b == c) {
            System.out.println(c);
        } */
    }
}
