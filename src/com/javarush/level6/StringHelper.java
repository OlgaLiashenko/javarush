package com.javarush.level6;

//Сделать класс StringHelper, у которого будут 2 статических метода:
//String multiply(String s, int count) - возвращает строку повторенную count раз.
//String multiply(String s) - возвращает строку повторенную 5 раз.
public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i=0; i<5; i++){
            System.out.print(s);
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i=0; i<count; i++){
            System.out.print(s);
        }
        return result;
    }

    public static void main(String[] args) {
    StringHelper.multiply("Amigo");
    StringHelper.multiply("Ola", 3);
    }
}
