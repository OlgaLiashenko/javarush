package com.javarush.level5;

public class DuckCat {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

       Cat cat1=new Cat();
       Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString(){
            return "Cat";
        }
    }
}
