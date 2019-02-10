package com.javarush.level5;

public class ManWoman {
    public static void main(String[] args) {

        Woman womenOne = new Woman("Anna", 22, "London");
        Man manOne = new Man("John", 43, "NY");
        Man manTwo = new Man("Pedro", "Boston");
        System.out.println(womenOne.name + " " + womenOne.age + " " + womenOne.address);
        System.out.println(manOne.name + " " + manOne.age + " " + manOne.address);
        System.out.println(manTwo.name + " " + manTwo.age + " " + manTwo.address);

    }

    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, String address) {
            this(name, 25, address);
        }
    }

    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }


}

