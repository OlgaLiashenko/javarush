package com.javarush.level4;

//Вывести на экран квадрат из 10х10 букв S используя цикл while.
//Буквы в каждой строке не разделять.
public class Dollar {
    public static void main(String[] args) throws Exception {

        //   int a = 0;
        //   while (a<10){
        //      System.out.println("SSSSSSSSSS");
        //      a++;
        // }
        // }

        int a = 0;
        while (a < 10) {
            int b = 0;
            while (b < 10) {
                System.out.print("S");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
