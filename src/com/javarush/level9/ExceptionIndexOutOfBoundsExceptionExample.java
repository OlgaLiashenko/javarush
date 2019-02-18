package com.javarush.level9;

import java.util.ArrayList;

//Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
public class ExceptionIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) throws Exception {
        try {
            ArrayList<String> stringList = new ArrayList<>();
            String strong = stringList.get(18);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
    }
}
