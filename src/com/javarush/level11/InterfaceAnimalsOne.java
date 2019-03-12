package com.javarush.level11;

public class InterfaceAnimalsOne {

    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public abstract class Cat implements CanRun, CanClimb {
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public abstract class Tiger extends Cat {
    }

    public abstract class Duck implements CanFly, CanRun {
    }
}
