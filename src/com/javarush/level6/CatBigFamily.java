package com.javarush.level6;
//У каждой кошки есть имя, кошка-папа и кошка-мама.
//Изменить класс Cat так, чтобы он мог описать данную ситуацию.
//Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
//Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
//Пример ввода:
//дедушка Вася
//бабушка Мурка
//папа Котофей
//мама Василиса
//сын Мурчик
//дочь Пушинка
//The cat's name is дедушка Вася, no mother, no father
//The cat's name is бабушка Мурка, no mother, no father
//The cat's name is папа Котофей, no mother, father is дедушка Вася
//The cat's name is мама Василиса, mother is бабушка Мурка, no father
//The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
//The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatBigFamily {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName, null,null);

        String grandMotherName = reader.readLine();
        Cat catGrandMother= new Cat(grandMotherName, null,null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father=father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
           else if (mother == null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
           else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name +", no father";
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;

        }
    }
}
