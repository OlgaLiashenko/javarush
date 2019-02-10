package com.javarush.level4;


public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next = 0;
        String result = first + " " + second;

        while (next < 100) {
            next = first + second;
            result = result + " " + next;

            first = second;
            second = next;
        }
        System.out.println(result);
    }
}
