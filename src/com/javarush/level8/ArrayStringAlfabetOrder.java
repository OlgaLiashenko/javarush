package com.javarush.level8;
//Задача:  выведи слова в алфавитном порядке. Каждое слово - с новой строки.

public class ArrayStringAlfabetOrder {
    public static void main(String[] args) throws Exception {
        String[] array = new String[4];
        array[0] = "bbb";
        array[1] = "aa";
        array[2] = "eeee";
        array[3] = "cccc";
        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] stringArray) {
        // Arrays.sort(stringArray);
        for (int i = 0; i < stringArray.length - 1; i++) {
            for (int j = 0; j < stringArray.length - 1 - i; j++) {
                String temp = "";
                if (isGreaterThan(stringArray[j], stringArray[j + 1])) {
                    temp = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = temp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

//    String str1 = "Strings are immutable";
//            String str2 = new String("Atrings are immutable");
//            String str3 = new String("Integers are not immutable");
//
//            int result = str1.compareTo( str2 );
//            System.out.println(result);
//
//            result = str2.compareTo( str3 );
//            System.out.println(result);
//        }
