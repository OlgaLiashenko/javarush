package com.javarush.level11;

//Переопредели метод setName в классе Cat так, чтобы программа выдавала на экран надпись
//"Я - кот"
public class CatExtendsPetTwo {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - cat");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Pet {

    }
}
