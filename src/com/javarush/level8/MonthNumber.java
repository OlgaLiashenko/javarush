package com.javarush.level8;


import org.junit.Assert;
import org.junit.Test;

import java.time.Month;

//Программа принимает значение в виде имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//Используйте коллекции.
public class MonthNumber {
    public static int getMonthNumber(String input) {

//        switch (input){
//            case "January": return 1;
//            case "February": return 2;
//            /////
//            default: return 0;
//        }
        return Month.valueOf(input.toUpperCase()).getValue();

//        ArrayList<String> month = new ArrayList<>();
//        month.add("January");
//        month.add("Febryary");
//        month.add("March");
//        month.add("April");
//        month.add("May");
//        month.add("June");
//        month.add("July");
//        month.add("August");
//        month.add("September");
//        month.add("October");
//        month.add("November");
//        month.add("December");
//
//        if (input.equals("")) {
//            System.out.println("Enter month");
//          //  break;
//        }
//        return (month.indexOf(input) + 1);
        // System.out.println(input + " is a " + (month.indexOf(input) + 1) + " month");
    }

    @Test
    public void checkMonth() {
        //     Assert.assertEquals("Get number of month", 5, getMonthNumber("May"));
        //given
        String input = "May";

        //when
        int result = getMonthNumber(input);

        //then
        Assert.assertEquals("Returns number of month", 5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkInvalidInput() {
        getMonthNumber("miay");
    }

    @Test(expected = NullPointerException.class)
    public void checkNullInput() {
        getMonthNumber(null);
    }
}

