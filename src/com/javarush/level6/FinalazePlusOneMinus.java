package com.javarush.level6;


//В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1.
// В методе finalize уменьшать на 1.

public class FinalazePlusOneMinus {

    public static int catCount = 0;

    public FinalazePlusOneMinus() {
        catCount ++;
    }

    protected void finilaze() throws Throwable {
        catCount -- ;
    }

    public static void main(String[] args) {

    }
}
