package com.javarush;

public class NewClass {

    public static void main(String[] args) {

        // write your code here
        int x = 0;
        while (x<3) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x<1) {
                System.out.print("oise");

            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x>1) {
                System.out.print(" oyster");
            }
            System.out.println("");
            x = x+1;
        }
    }
}
