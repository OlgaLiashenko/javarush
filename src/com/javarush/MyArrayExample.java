package com.javarush;

public class MyArrayExample {
    public static void main(String[] args) {

        int[] firstArray;

        String[] s;
        s = new String[10];

        String[] n = new String[10];

        n[9] = "Hello";

        int[] abc = {1, 2, 3, 4, 5};
        int c = abc[0];
        abc[0] = abc[4];
        abc[4] = c;


        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"},
                {"iiiiii"},
                {"one", "two"}

        };
        String[] namesZero = names[0]; ///  {"Mr. ", "Mrs. ", "Ms. "},
        String nameZZ= names[0][0]; // "Mr. "
        String jones = names[1][1]; // Jones
        String one = names[3][0]; //one

        String [] newArray = {"my","array"};

         names[2] = newArray;

         newArray[0]= "olololo";



        System.out.println();




    }
}
