package com.javarush.level9;

import java.io.IOException;
import java.rmi.RemoteException;

//Есть четыре класса MyException, MyException2, MyException3, MyException4.
//Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения

public class ExceptionCheckedAndUnchecked {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends RemoteException {
    }

    static class MyException3 extends NullPointerException {
    }

    static class MyException4 extends MyException3 {
    }
}
