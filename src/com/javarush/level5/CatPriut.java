package com.javarush.level5;

//Создать класс Cat (кот) с пятью инициализаторами:
//- Имя,
//- Имя, вес, возраст
//- Имя, возраст (вес стандартный)
//- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
//- вес, цвет, адрес (чужой домашний кот)

public class CatPriut {
    String name;
    int age;
    int weight;
    String address;
    String color;
    private static final String DEFAULT_COLOR = "grey";
    private static final int DEFAULT_WEIGHT = 4;
    private static final int DEFAULT_AGE = 3;

    public void initialize(String name) {
        this.name = name;
        this.age = DEFAULT_AGE;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = DEFAULT_COLOR;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = DEFAULT_WEIGHT;
        this.color = DEFAULT_COLOR;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = DEFAULT_AGE;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = DEFAULT_AGE;
    }


    public static void main(String[] args) {
    }
}

