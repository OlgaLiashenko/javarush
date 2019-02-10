package com.javarush.level5;

//Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
//Создать для него как можно больше методов initialize(...)
//
//Примеры:
//- заданы 4 параметра: left, top, width, height
//- ширина/высота не задана (оба равны 0)
//- высота не задана (равно ширине) создаём квадрат
//- создаём копию другого прямоугольника (он и передаётся в параметрах)

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.initialize(2, 3, 4, 5);

        Rectangle rectangleCopy = new Rectangle();

        rectangleCopy.initialize(rectangle);

        rectangleCopy.initialize(0, 0, 0, 0);
    }
}


