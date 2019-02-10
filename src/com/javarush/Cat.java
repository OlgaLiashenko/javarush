package com.javarush;

public class Cat {
    private String name = "безымянный кот";
    private static final String STATIC_NAME = "The кот";


    public void setName(String name) {
        this.name = name;


    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
        System.out.println(Cat.STATIC_NAME);
    }


    public boolean equals(Cat cat) {
        return this.name.equals(cat.name);
    }
}

