package com.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Ввести с клавиатуры три числа, и вывести их в порядке убывания.
// Выведенные числа должны быть разделены пробелом.
public class ThreeSort {

//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//
//        // System.out.println(Math.max(Math.max(a, b), c));  // выводит одно максимальное число
//       // int max = Math.max(Math.max(a, b), c);
//
//
//    }

 /*   public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(ThreeSort.maximum(a,b,c) + " " + ThreeSort.medium(a,b,c) + " " + ThreeSort.minimum(a,b,c) );
    }

    public static int maximum(int a, int b, int c)
    {
        int max = a;
        if(b > max )
            max = b;
        if (c>max)
            max =c;
        return max;
      //  return Math.max(Math.max(a, b), c);
    }

    public static int minimum(int a, int b, int c)
    {
        int min = a;
        if (b< min)  min = b;
        if (c< min) min = c;
        return min;

    }
    public static int medium(int a, int b, int c)
    {
        int sum = a + b + c;
        int med = sum - ThreeSort.minimum(a,b,c) - ThreeSort.maximum(a,b,c);
        return med;
    }  */


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int t;
        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
        if (b < c) {
           t = b;
           b = c;
           c = t;
        }
        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
        System.out.println(a + " " + b + " " + c);
    }


}
