package com.javarush.level11;

//Напиши метод, который определяет, какой объект передали в него.
//Программа должна выводить на экран одну из надписей:
//"Кот", "Тигр", "Лев", "Бык", "Корова", "Животное".
public class AnimalsTwo {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код

        if (o instanceof Tiger) {
            return "Tiger";
        }
        if (o instanceof Lion) {
            return "Lion";
        }
        if (o instanceof Bull) {
            return "Bull";
        }
        if (o instanceof Cow) {
            return "Cow";
        }
        if (o instanceof Cat) {
            return "Cat";
        }
        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
