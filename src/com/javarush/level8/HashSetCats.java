package com.javarush.level8;

import java.util.HashSet;
import java.util.Set;

//1. Внутри класса Solution создать public static класс кот - Cat.
//2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
//3. В методе main удалите одного кота из Set cats.
//4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
//Каждый кот с новой строки.


public class HashSetCats {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        for(Cat deleteCat : cats){
            cats.remove(deleteCat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat strings : cats){
            System.out.println(strings);
        }
    }

    public static class Cat {
    }
}
