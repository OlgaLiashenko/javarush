package com.javarush;

public class Main {

    public static void main(String[] args) {
        //strings example
        String one1 = "one";
        String one = one1;
        String two = one1;
        String three = new String(one1);
        String four = "o" + "ne";

        boolean oneTwo = one == two;
        boolean twoThree = two == three;
        boolean twoEqThree = two.equals(three);
        boolean twoFour = two == four;
        boolean twoEqFour = two.equals(four);

        // write your code here
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
            }
            x = x - 1;

        }
    }
}


