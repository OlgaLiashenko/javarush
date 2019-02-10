package com.javarush.level5;

//Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
//Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
//Должно выполняться условие:
//если cat1.fight(cat2) возвращает true,
//то cat2.fight(cat1) должен возвращать false

public class Cat {
    String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        return ((this.strength + this.weight) * this.age) > ((anotherCat.strength + anotherCat.weight) * anotherCat.age);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Iks", 3,4,3);
        Cat cat2 = new Cat("Pixel", 5,6,3);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }

}
