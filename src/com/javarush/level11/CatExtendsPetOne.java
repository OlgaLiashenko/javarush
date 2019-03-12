package com.javarush.level11;
//Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись "Я - кот".

public class CatExtendsPetOne {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - cat";
        }
    }

    public static class Cat extends Pet {

    }
}
