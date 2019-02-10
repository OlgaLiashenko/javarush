package com.javarush.level8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
//Удалить из словаря всех людей, родившихся летом.

public class HashMapStringDate {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Vallmart", df.parse("JULY 4 1990"));
        map.put("MaxMara", df.parse("MAY 6 1994"));
        map.put("Holyrare", df.parse("NOVEMBER 18 1991"));
        map.put("Bobmart", df.parse("AUGUST 4 1992"));
        map.put("Rarest", df.parse("AUGUST 24 1982"));
        map.put("Most", df.parse("FEBRUARY 21 1986"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
//        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Date> values = iterator.next();
//            String date = values.getValue().toString();
//            if (date.contains("JUNE") || date.contains("JULY") || date.contains("AUGUST")) {
//                iterator.remove();
//            }
//        }
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> values = iterator.next();
            if (values.getValue().getMonth() >= 5 && values.getValue().getMonth() <= 7) {
                iterator.remove();
            }
        }
//return map.entrySet();
      //  map.entrySet().removeIf(pair -> pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8);
    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> map = createMap();
        //  System.out.println(removeAllSummerPeople(map));
        removeAllSummerPeople(map);

        for (HashMap.Entry<String, Date> afterRemove : map.entrySet()) {
            System.out.println(afterRemove);
        }
    }
}
