package com.javarush.level5;

public class Person {
    public static void main(String[] args) {

        PersonTwo person = new PersonTwo();

        person.initialize("Ivan", 22);
        System.out.println(person.name + " " + person.age);
    }

    static class PersonTwo {
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
