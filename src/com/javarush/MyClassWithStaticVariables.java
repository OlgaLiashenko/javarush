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

    public static void main(String[] args) {
        MyClassWithStaticVariables first = new MyClassWithStaticVariables();
        first.instanceVariable = 1;
        MyClassWithStaticVariables.staticVariable = 432;
        System.out.println(first.toString());

        MyClassWithStaticVariables second = new MyClassWithStaticVariables();
        second.instanceVariable = 2;
        System.out.println(second.toString());

    }

    public String toString() {
        return "this instance variable =" + instanceVariable + " static variable = " + staticVariable;
    }
}
