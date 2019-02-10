package com.javarush.level7;

//Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
// Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
//Примечание:
//Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
//Пример вывода:
//Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
//Имя: Катя, пол: женский, возраст: 55
public class Family {
    public static void main(String[] args) {

        Human grandFatherOne = new Human("John", true, 77);
        Human grandFatherTwo = new Human("Bob", true, 80);
        Human grandMotherOne = new Human("Monica", false, 68);
        Human grandMotgerTwo = new Human("Emily", false, 75);
        Human father = new Human("Don", true, 50, grandFatherOne, grandMotherOne);
        Human mother = new Human("Ann", false, 48, grandFatherTwo, grandMotgerTwo);
        Human sonOne = new Human("Ron", true, 32, father, mother);
        Human sonTwo = new Human("Tom", true, 25, father, mother);
        Human daughterOne = new Human("Kate", false, 22, father, mother);

        System.out.println(grandFatherOne);
        System.out.println(grandFatherTwo);
        System.out.println(grandMotherOne);
        System.out.println(grandMotgerTwo);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sonOne);
        System.out.println(sonTwo);
        System.out.println(daughterOne);
    }


    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text +="Name: " + this.name;
            text +=", sex: " + (this.sex ? "man" : "woman");
            text +=", age: " + this.age;
            if(this.father != null){
                text +=", father: " + this.father.name;
            }
            if(this.mother != null){
                text+=", mother: " + this.mother.name;
            }
            return text;

        }
    }
}
