package com.javarush;

public class User {
    String name;
    short age;
    int height;

    //напишите ваш код здесь
    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public User(int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public User(String name, int height, short age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public User(int height, short age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public User(short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %s\nHeight: %d", this.name, this.age, this.height);
    }

    public static void main(String[] args) {
        User userOne = new User("John", (short) 30, 178);
        System.out.println(userOne);
        System.out.println(userOne.name + ", " + userOne.age + ", " + userOne.height);
    }
}
