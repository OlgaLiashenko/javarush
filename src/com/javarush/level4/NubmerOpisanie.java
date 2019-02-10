package com.javarush.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NubmerOpisanie {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

      /*  if ((a<0) && (a%2==0)){
            System.out.println("отрицательное четное число");
        }
        if (a<0 && a%2!=0){
            System.out.println("отрицательное нечетное число");
        }
        if (a==0){
            System.out.println("ноль");
        }
        if (a>0 && a%2==0){
            System.out.println("положительное четное число");
        }
        if (a>0 && a%2!=0){
            System.out.println("положительное нечетное число");
        } */

        boolean even = a % 2 == 0;

        if (a < 0) {
            if (even) {
                System.out.println("отрицательное четное число");
            } else {
                System.out.println("отрицательное нечетное число");
            }
        } else if (a > 0) {
            if (even) {
                System.out.println("положительное четное число");
            } else {
                System.out.println("положительное нечетное число");
            }
        } else {
            System.out.println("ноль");
        }
    }
}
