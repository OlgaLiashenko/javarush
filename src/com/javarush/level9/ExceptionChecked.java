package com.javarush.level9;

import java.io.IOException;
import java.rmi.RemoteException;

//В методе handleExceptions обработайте все checked исключения.
//Нужно вывести на экран возникшее checked исключение.
//Можно использовать только один блок try..catch

public class ExceptionChecked {
    public static void main(String[] args) {
        handleExceptions(new ExceptionChecked());
    }

    public static void handleExceptions(ExceptionChecked obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException | NoSuchFieldException e) {
            System.out.println(e);
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
