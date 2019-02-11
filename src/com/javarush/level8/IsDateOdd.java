package com.javarush.level8;
//1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
//2. String date передается в формате FEBRUARY 1 2013
//Не забудьте учесть первый день года.

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class IsDateOdd {

    public static boolean isOdd(String date) {

        if (date == null || date.equals("")) {
            return false;
        }

        Date startYear;

        try {
            startYear = new Date(date);
        } catch (IllegalArgumentException ex) {
            return false;
        }
        startYear.setHours(0);
        startYear.setMinutes(0);
        startYear.setSeconds(0);
        startYear.setDate(1);
        startYear.setMonth(0);

        Date inputDate = new Date(date);

        long msTime = inputDate.getTime() - startYear.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int countDays = (int) (msTime / msDay);
        return (countDays + 1) % 2 != 0;


        // 2 option
    /*    Date startOfYear = new Date(date); //создание нового объекта даты на основе String data
        SimpleDateFormat dayNumber = new SimpleDateFormat("D"); //задаётся формат для даты,
        //"D"-номер дня в году
        int days = Integer.parseInt(dayNumber.format(startOfYear)); // применяем формат к  дате
        //и преобразуем к типу int
        return days%2!=0; //проверка на нечётность и возвращение значения типа boolean
        */
    }

    @Test
    public void checkTrue() {
        Assert.assertTrue("Return true - the day is odd", isOdd("January 15 2018"));
    }

    @Test
    public void checkFalse() {
        Assert.assertFalse("The date format is true, but returns false", isOdd("March 16 2008"));
    }

    @Test
    public void checkNullDate() {
        Assert.assertFalse("Should return false", isOdd(null));
    }

    @Test
    public void checkEmptyDate() {
        Assert.assertFalse("Should return false", isOdd(""));
    }

    @Test
    public void checkWrongInput() {
        Assert.assertFalse("The date format is false", isOdd(" 12 Nebrityabria 2008"));
    }
}
