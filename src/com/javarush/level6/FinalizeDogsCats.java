package com.javarush.level6;


//Создать в цикле по 50 000 объектов Cat и Dog.
//(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).

public class FinalizeDogsCats {
    public static void main(String[] args) {

        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
