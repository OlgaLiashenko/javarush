package com.javarush.level6;

//Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
//с помощью которых можно получить/изменить количество котов (переменную catCount).
public class CatGetSet {
    private static int catCount = 0;

    public CatGetSet() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int g) {
        catCount = g;
    }

    public static void main(String[] args) {
        System.out.println("Начальное значение: " + catCount);
        int a = getCatCount();
        System.out.println("После геттера (но без сеттера) " + a);
        setCatCount(5);
        int b = getCatCount();
        System.out.println("На этом этапе сеттер уже установил значение 5, и новое значение int b, получим через геттер: " + b);
        System.out.println("При этом, значение переменной a: " + a);
        int c = getCatCount();
        System.out.println("После того как сеттер установил значение 5, все новые переменные через геттер будут: " + c);
        int d = CatGetSet.catCount;
        System.out.println("Даже если новая переменная создана без геттера, она все равно уже изменена сеттером и равна: " + d);
    }
}
