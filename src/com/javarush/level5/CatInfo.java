package com.javarush.level5;

//Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
public class CatInfo {
    public static void main(String[] args) {
        Cat catOne = new Cat("Vaska", 3,4,5);
        Cat catTwo = new Cat("Maska", 2,3,6);
        Cat catThree = new Cat("Mosks",1,2,3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }

}
