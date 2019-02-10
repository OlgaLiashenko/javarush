package com.javarush;

public class Inherritance {

    interface AnimalInterface {
        void walk();
    }

    abstract static class Animal {
        //make noise
        abstract void makeSomeNoise();
    }

    static class Dog extends Animal implements AnimalInterface {

        @Override
        void makeSomeNoise() {
            System.out.println("Dog says 'bark'");
        }

        @Override
        public void walk() {
            System.out.println("start walking");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSomeNoise() {
            System.out.println("Cat says 'meow'");
        }
    }

    public static void main(String[] args) {
        System.out.println("Start");

        Dog dog = new Dog();
        Animal cat = new Cat();

        askAnimal(dog);
        askAnimal(cat);
        dog.walk();
        cat.makeSomeNoise();

    }

    static public void askAnimal(Animal animal) {
        animal.makeSomeNoise();
    }
}
