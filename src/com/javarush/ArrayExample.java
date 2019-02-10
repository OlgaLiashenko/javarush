package com.javarush;

public class ArrayExample {
    public static void main(String args[]) {
        //array
        int[] integerArrayNull; // array type integer, integerArrayNull == null
        int[] integerArrayInitialized = new int[]{1, 22, 31, 4}; // size = 4, {1,22,31,4}

        int[] integerArrayNotInitialized = new int[4]; //integerArrayNotInitialized array with size 4. {0,0,0,0}
        String[] stringArrayNotInitialized = new String[2];//size 2 {null, null}
        stringArrayNotInitialized[0]="First element of my array";
        stringArrayNotInitialized[1]="Second element of my array";

        integerArrayNotInitialized[3] = 5; // integerArrayNotInitialized {0,0,0,5}

//        integerArrayNotInitialized[4] = 5; // EXCEPTION ArrayOutOfBounds


        //two dimensional  {{0,0,0},
        //                  {0,0,0}}
        int[][] twoDimensionalIntArray = new int[2][3];


        //{{1,2,3},{5,6,7}}
        int[][] twoDimensionalArrayInitialized = new int[][]{{1, 2, 3}, {5, 6, 7}};

        int arrayLength = integerArrayNotInitialized.length; // 4
        String[] cloneStringArray = stringArrayNotInitialized.clone(); // create a copy

        for (int i = 0; i < integerArrayInitialized.length; i++) {
            System.out.println(
                    "integerArrayInitialized element #" + i + " = '" + integerArrayInitialized[i] + "'");
        }

        System.out.println();
    }
}
