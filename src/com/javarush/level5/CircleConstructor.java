package com.javarush.level5;

public class CircleConstructor {
    public double x;
    public double y;
    public double radius;

    public CircleConstructor(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public CircleConstructor(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public CircleConstructor() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        CircleConstructor circle = new CircleConstructor();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        CircleConstructor anotherCircle = new CircleConstructor(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
