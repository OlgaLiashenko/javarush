package com.javarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintFromKeyboard {

    // операции с числом
 /*   public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num < 0) {
            System.out.println(num + 1);
        } else if (num > 0) {
            System.out.println(num * 2);
        } else {
            System.out.println(0);
        }
    }  */



  /*  //дни недели

   public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());

        if (day == 1) {
            System.out.println("понедельник");
        } else if (day == 2) {
            System.out.println("вторник");
        } else if (day == 3) {
            System.out.println("среда");
        } else if (day == 4) {
            System.out.println("четверг");
        } else if (day == 5) {
            System.out.println("пятница");
        } else if (day == 6) {
            System.out.println("суббота");
        } else if (day == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }
    }  */


  /*   // високостный год
//  годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
// Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
// Годы 2100, 2200 и 2300 - не високосные.

  public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt( reader.readLine() );

        if (year%400==0){
            System.out.println("количество дней в году: 366");
        }
        else if (year%100==0){
            System.out.println("количество дней в году: 365");
        }
        else if (year%4==0){
            System.out.println("количество дней в году: 366");

        }
        else {
            System.out.println("количество дней в году: 365");
        }
    }  */


  /*
  // Определить возможность существования треугольника по сторонам.
// Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
// Требуется сравнить каждую сторону с суммой двух других.
// Если хотя бы в одном случае сторона окажется больше или равна сумме двух других, то треугольника с такими сторонами не существует.
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }  */


  /* //светофор, число до 60 минут
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    double t = Double.parseDouble( reader.readLine() );

    double a = t%5;
    if (a<3){
        System.out.println("зелёный");
    } else if (a<4 ){
        System.out.println("жёлтый");
    } else {
        System.out.println("красный");
    }
}  */


    // вывести одинаковые числа
   /* public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b || a == c) {
            System.out.print(a + " ");
        }
        if (b == a || b == c) {
            System.out.print(b + " ");
        }
        if (c == a || c == b) {
            System.out.print(c + " ");
        }
    }  */

  /*  public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a == b) {
            System.out.println(a + ", " + b);
        } else if (a == c) {
            System.out.println(a + ", " + c);
        } else if (b == c) {
            System.out.println(b + ", " + c);
        }
    }  */




/*    // вывести минимальное из чисел.
//Если два числа равны между собой, необходимо вывести любое.
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        //  if (a < b) {
        //    System.out.println(a);
        //  } else {
        //     System.out.println(b);
        // }
        System.out.println((a < b) ? a : b);
    } */




    //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
//Если числа равны между собой, необходимо вывести любое.
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
//      1 способ
//      int ab=  Math.max(a, b);
//      int cd=  Math.max(c, d);
//      int max=  Math.max(ab, cd);
//        System.out.println(max);
        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));

//      2 способ
        int result = a;
        if (result < b) {
            result = b;
        }
        if (result < c) {
            result = c;
        }
        if (result < d) {
            result = d;
        }
        System.out.println(result);

        // if(a>b) {return a;} else {return b;}   ->   (a>b) ? a : b;

//      3 способ
        int otherRes = (a < b) ? b : a;
        otherRes = (otherRes < c) ? c : otherRes;
        otherRes = (otherRes < d) ? d : otherRes;
        System.out.println(otherRes);
    }


}
