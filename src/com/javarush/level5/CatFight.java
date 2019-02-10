package com.javarush.level5;

//Создать три кота используя класс Cat.
//Провести три боя попарно между котами.
//Результат каждого боя вывести на экран c новой строки.

public class CatFight {
    public static void main(String[] args) {
        Cat Vaska = new Cat("Vaska", 3, 4, 6);
        Cat Maska = new Cat("Maska", 4, 4, 5);
        Cat Moska = new Cat("Moska", 2, 3, 4);

        System.out.println("Vaska fights Moska " + Vaska.fight(Moska));
        System.out.println("Vaska fights Maska " + Vaska.fight(Maska));
        System.out.println("Moska fights Maska " + Moska.fight(Maska));

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score >= 2; // return score > 2 ? true : false;
        }
    }
}
