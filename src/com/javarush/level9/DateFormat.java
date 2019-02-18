package com.javarush.level9;
//Ввести дату в формате "2018-08-14"
//Вывести на экран введенную дату в виде "AUG 14, 2018".
//Воспользоваться объектом Date и SimpleDateFormat.

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormat {
    public static void main(String[] args) throws Exception {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date input = simpleDateFormat.parse("2018-08-14");

        String newPattern = "MMM dd, yyyy";
        SimpleDateFormat newDateFormat = new SimpleDateFormat(newPattern);
        String output = newDateFormat.format(input).toUpperCase();
        System.out.println(output);


        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String yearCheck = yearFormat.format(input);
        int yearIsLeap = Integer.parseInt(yearCheck);


        GregorianCalendar gcalendar = new GregorianCalendar();
        gcalendar.setTime(input);
        int year = gcalendar.get(Calendar.YEAR);

        if (gcalendar.isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }

    }
}
