package com.javarush.level8;

public class HappyTicket {
    public static void main(String[] args) {

        // 1 option
     /*   int[] numbers = {1, 4, 3, 1, 4, 3};
        int sumLeft = 0;
        int sumRight = 0;

        sumLeft = numbers[0]+numbers[1]+numbers[2];
        sumRight = numbers[3]+numbers[4]+numbers[5];

        if(sumLeft==sumRight){
            System.out.println("билет счастливый!");
        }
        else {
            System.out.println("билет не счастливый :(");
        }
        */


     /*
        // 2 optin
        int ticket = 123322;
        int newTicket = 0;
        int temp = ticket;
        int count = 0;
        int sumR = 0;
        int sumL = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        temp = count / 2;

        for (int i = 0; i < temp; i++) {
            int newNumber = ticket % 10;
            sumR += newNumber;
            ticket = ticket / 10;
        }

        newTicket = ticket;

        for (int i = 0; i < temp; i++) {
            int newNumber = newTicket % 10;
            sumL += newNumber;
            newTicket = newTicket / 10;
        }

        if (sumL == sumR) {
            System.out.println("билет счастливый!");
        } else {
            System.out.println("билет не счастливый :(");
        }
        System.out.println(sumR);
        System.out.println(count);
        System.out.println(ticket);

        */


     /*
        // 3 optin
        int ticket = 123344;
        int leftPatrTicket = 0;
        int rightPartTicket = 0;
        int sumR = 0;
        int sumL = 0;

        String numbers = Integer.toString(ticket);

        if (numbers.length() % 2 != 0) {
            System.out.println("введите четное кол-во чисел билета");
            return;
        }

        rightPartTicket = ticket%1000;
        sumR = getSumOfDigits(rightPartTicket);

        leftPatrTicket = ticket/1000;

        sumL = getSumOfDigits(leftPatrTicket);

        if (sumL == sumR) {
            System.out.println("билет счастливый!");
        } else {
            System.out.println("билет не счастливый :(");
        }

    }

    public static int getSumOfDigits(int input) {
        String numbers = Integer.toString(input);
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            int temp = input % 10;
            sum = sum + temp;
            input = input / 10;
        }
        return sum;
    }
    */


        // 4 optin
        int ticket = 1233;
        int sumR = 0;
        int sumL = 0;
        String numbers = Integer.toString(ticket);
        if (numbers.length() % 2 != 0) {
            System.out.println("введите четное кол-во чисел билета");
            return;
        }
        sumL = getSumOfDigits(getLeftLength(ticket));
        sumR = getSumOfDigits(getRightLength(ticket));

        if (sumL == sumR) {
            System.out.println("билет счастливый!");
        } else {
            System.out.println("билет не счастливый :(");
        }
    }
    public static int getLeftLength(int input) {
        String numbers = Integer.toString(input);
        int numbersLength = numbers.length();
        if (numbersLength == 2) {
            input = input / 10;
        } else if (numbersLength == 4) {
            input = input / 100;
        } else if (numbersLength == 6) {
            input = input / 1000;
        } else if (numbersLength == 8) {
            input = input / 10000;
        }
        return input;
    }
    public static int getRightLength(int input) {
        String numbers = Integer.toString(input);
        int numbersLength = numbers.length();
        if (numbersLength == 2) {
            input = input % 10;
        } else if (numbersLength == 4) {
            input = input % 100;
        } else if (numbersLength == 6) {
            input = input % 1000;
        } else if (numbersLength == 8) {
            input = input % 10000;
        }

        return input;
    }

    public static int getSumOfDigits(int input) {
        String numbers = Integer.toString(input);
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            int temp = input % 10;
            sum = sum + temp;
            input = input / 10;
        }
        return sum;
    }
}
