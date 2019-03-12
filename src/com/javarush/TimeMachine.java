package com.javarush;

public class TimeMachine {

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();
        int currentYear = 2018;

        System.out.println("Какой сейчас год?");
        System.out.println(currentYear);

        int newCurrentYear = timeMachine.goToPast(currentYear);
        System.out.println("А сейчас?");
        System.out.println(newCurrentYear);

    }

    public void goToFuture(int currentYear) {
        currentYear = currentYear + 10;
    }

    public int goToPast(int currentYear) {

        currentYear = currentYear - 10;
        return currentYear;
    }


}


