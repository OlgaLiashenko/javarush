package com.javarush.level5;

public class FriendConstructor {
    String name;
    int age;
    char sex;

    public FriendConstructor(String name){
        this.name=name;
    }

    public FriendConstructor(String name, int age){
        this.name=name;
        this.age=age;
    }
    public FriendConstructor(String name, int age, char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public static void main(String[] args) {

    }
}
