package com.javarush.level7;

//1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DvaMassivaIzOdnogo {
    public static void main(String args[]) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int[] massivB = new int[20];
        int[] first = new int[10];
        int[] second = new int[10];

        for (int i = 0; i < massivB.length; i++) {
            massivB[i] = Integer.parseInt(buff.readLine());
        }

        for (int i = 0; i < 10; i++) {
            first[i] = massivB[i];
            second[i] = massivB[i + 10];
            System.out.println(second[i]);
        }

       // System.out.println(Arrays.toString(second));
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