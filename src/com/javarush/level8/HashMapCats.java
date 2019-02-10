package com.javarush.level8;
//Есть класс Cat с полем имя (name, String).
//Создать коллекцию HashMap<String, Cat>.
//Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//Вывести результат на экран, каждый элемент с новой строки.

import java.util.HashMap;
import java.util.Map;

public class HashMapCats {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue().toString());
        }
    }

    public static HashMap<String, Cat> addCatsToMap(String[] cats) {

        HashMap<String, Cat> putMap = new HashMap<>();
        // В теле цикла мы для каждого имени кота из массива строк cats заносим в коллекцию puMap пары значений
        // ["Имя кота" - "Объект типа кот"]. Метод put() описываемый ранее.

          for(String name : cats){
//              Cat cat = new Cat(name);
//             putMap.put(name, cat);
             putMap.put(name, new Cat(name));
          }

//        for (int i = 0; i < cats.length; i++) {
//            putMap.put(cats[i], new Cat(cats[i]));
//
            // Cat cat = new Cat(cats[i]);
            // putMap.put(cats[i],cat);
//        }
        return putMap;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return (name == null) ? null : name.toUpperCase();
        }
    }
}

