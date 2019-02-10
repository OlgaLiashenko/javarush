package com.javarush.level5;

public class CatConstructor {

    String name;
    int age;
    int weight;
    String address;
    String color;

    private static final String DEFAULT_COLOR = "grey";
    private static final int DEFAULT_WEIGHT = 4;
    private static final int DEFAULT_AGE = 3;

    public CatConstructor(String name) {
        this.name = name;
        this.age = DEFAULT_AGE;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }

    public CatConstructor(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = DEFAULT_COLOR;
    }

    public CatConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }

    public CatConstructor(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = DEFAULT_AGE;
    }

    public CatConstructor(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = DEFAULT_AGE;
    }

    public static void main(String[] args) {

    }
}
