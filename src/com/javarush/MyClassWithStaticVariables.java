package com.javarush;

public class MyClassWithStaticVariables {

    public static int staticVariable = 123;

    public int instanceVariable;

    public void setInstanceVariable(int inputInstanceVariable) {
        this.instanceVariable = inputInstanceVariable * 10;
    }


    public static int multiplyByTwo(int input) {
        return input * 2;
    }

    public int multiplyInstanceVariableByTwo() {
        return this.instanceVariable * 2;
    }
}
