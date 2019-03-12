package com.javarush.level10;

//Напиши класс Human с 6 полями.
//Придумай и реализуй 10 различных конструкторов для него.
//Каждый конструктор должен иметь смысл.
public class HumanConstructor {
    public static void main(String[] args) {
    }

    public static class Human {
        private static String name;
        private static int age;
        private static boolean sex;
        private static int weightKg;
        private static String address;
        private static String hairColor;

        public Human() {
        }

        public Human(String name) {
        }

        public Human(String name, boolean sex) {
        }

        public Human(String name, int age) {
        }

        public Human(String name, int age, boolean sex) {
        }

        public Human(String name, int weightKg, String address) {
        }

        public Human(String name, String hairColor, boolean sex) {
        }

        public Human(String name, String address, int age, boolean sex) {
        }

        public Human(String name, int age, boolean sex, int weightKg) {
        }

        public Human(String name, int age, String hairColor, boolean sex) {
        }
    }
}
