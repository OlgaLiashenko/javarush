package com.javarush.level6;

//1. В классе Solution создать public static класс Idea
//2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
//3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить на экран
// описание идеи - это то, что возвращает метод getDescription

public class DescrIdea {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static class Idea {
        public String getDescription() {
            return "Hello";
        }
    }
}
