package com.javarush.hackerrank;

public class MultiplicateTableForNumber {
    public static void main(String[] args) {
        int number = 9;
        for (int i = 1; i < 10; i++) {
            int result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
    }
}
