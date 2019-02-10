package com.javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
//Вывести на экран номер координатной четверти, в которой находится данная точка.
public class Quart {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a>0 && b>0){
            System.out.println("1");
        }
        if (a<0 && b>0){
            System.out.println("2");
        }
        if (a<0 && b<0){
            System.out.println("3");
        }
        if (a>0 && b<0){
            System.out.println("4");
        }
    }
}
