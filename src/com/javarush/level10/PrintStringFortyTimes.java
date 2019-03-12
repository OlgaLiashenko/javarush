package com.javarush.level10;

public class PrintStringFortyTimes {
    public static void main(String[] args) throws InterruptedException {

        String input = "I like coffee";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(input);
            }
            System.out.println("");
            Thread.sleep(1000);
        }
    }
}

