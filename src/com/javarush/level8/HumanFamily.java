package com.javarush.level8;
//1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
//2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
//3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

import java.util.ArrayList;

public class HumanFamily {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human childOne = new Human("Anna", false, 14);
        Human childTwo = new Human("Alex", true, 16);
        Human childTree = new Human("Kate", false, 18);
        Human father = new Human("Yar", true, 35);
        Human mother = new Human("Nona", false, 33);
        ArrayList<Human> children = new ArrayList<Human>() {{
            add(childOne);
            add(childTwo);
            add(childTree);
        }};
        father.setChildren(children);
        mother.setChildren(children);

        Human grandfatherOne = new Human("Evan", true, 68);
        Human grandmotherOne = new Human("Lola", false, 66);
        ArrayList<Human> fatherAsChild = new ArrayList<>();
        fatherAsChild.add(father);

        grandfatherOne.setChildren(fatherAsChild);
        grandmotherOne.setChildren(fatherAsChild);

        Human grandFatherTwo = new Human("Anatol", true, 72);
        Human grandMotherTwo = new Human("Monika", false, 69);
        ArrayList<Human> motherAsChild = new ArrayList<>();
        motherAsChild.add(mother);
        grandFatherTwo.setChildren(motherAsChild);
        grandMotherTwo.setChildren(motherAsChild);

        System.out.println(grandfatherOne);
        System.out.println(grandmotherOne);
        System.out.println(grandFatherTwo);
        System.out.println(grandMotherTwo);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childTree);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public void setChildren(ArrayList<Human> children) {
            this.children = children;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
