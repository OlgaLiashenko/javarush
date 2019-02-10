package com.javarush.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/*
Массивный максимум
*/

public class ArrayMax {
    public static void main(String[] args) throws Exception {
//        int[] mass = initializeArray();
        int[] mass = initializeArrayRandom();
        System.out.println(Arrays.toString(mass));
        int max = max(mass);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            String s = reader.readLine();
            mass[i] = Integer.parseInt(s);
        }
        return mass;
    }

    public static int[] initializeArrayRandom() {
        int[] mass = new int[20];
        Random r = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(100);
        }
        return mass;
    }

    public static int max(int[] mass) {
        int maximum = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > maximum) {
                maximum = mass[i];
            }
        }
        return maximum;
    }
}

//5
//10
//16
//17
//9
//3
//4
//46
//97
//89
//12
//45
//98
//111
//42
//98
//98
//-9
//71
//-150