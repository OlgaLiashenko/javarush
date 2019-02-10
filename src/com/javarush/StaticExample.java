package com.javarush;

public class StaticExample {

    public static void main(String... args) {

        int getFromStatic = MyClassWithStaticVariables.staticVariable;

        int getFromStatic2 = MyClassWithStaticVariables.staticVariable;

        int multiplied = MyClassWithStaticVariables.multiplyByTwo(4);
//        ==

        MyClassWithStaticVariables myClassWithStaticVariables = new MyClassWithStaticVariables();


        int notStatic = myClassWithStaticVariables.instanceVariable;

        int multipliedInstanceVariable = myClassWithStaticVariables.multiplyInstanceVariableByTwo();

        myClassWithStaticVariables.setInstanceVariable(11);

        int notStaticAfterInitialization = myClassWithStaticVariables.instanceVariable;

        int multipliedInstanceVariableAfterInitialization = myClassWithStaticVariables.multiplyInstanceVariableByTwo();

        System.out.println("");
    }


}
