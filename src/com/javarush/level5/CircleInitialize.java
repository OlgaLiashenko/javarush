package com.javarush.level5;
//centerX, centerY, radius, width, color
public class CircleInitialize {
int centerX;
int centerY;
int radius;
int width;
int color;

public void initialize(int centerX, int centerY, int radius){
    this.centerX=centerX;
    this.centerY=centerY;
    this.radius=radius;
}

public void initialize(int centerX, int centerY, int radius, int width, int color){
    this.centerX=centerX;
    this.centerY=centerY;
    this.radius=radius;
    this.width=width;
    this.color=color;
}

    public static void main(String[] args) {
    }

}
