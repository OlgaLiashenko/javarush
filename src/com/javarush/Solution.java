package com.javarush;

public class Solution {
       public static void main(String[] args) {


       /* int x = 0;
       while (x<5) {
           System.out.println("Ola");
           x = x+1; */

    //System.out.println("Это не баг, это фича");

       /*  String a = "Это не баг, ";
        String b = "это фича";
        System.out.println(a + b); */

       /* String s = "23";
        int a = 3, b = 2;
        String four = "четыре";
        String three = "3";

        System.out.print(b);
        System.out.print(" плюс ");
        System.out.print(a);
        System.out.print(" равно ");
        System.out.print(a + b);  */

       /* int x = 2;
        int y = 12;

         y = x + y;
         x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);  */

      /* int a = 1, c = 3;
       int b = 2;  */

     /* String name = "Hello";
      System.out.println(name);  */


        /* int number = 25;
        int b = number * number;
        System.out.println(b); */

       /* int x = 0;
        while (x<10){
            System.out.println("JavaRush. Learn once - use anywhere");
            x = x + 1; */

       /* String name = "Amigo";
        String text = "Hello, " + name + "!";
        System.out.println(text); */

       /* System.out.println("Меня зовут Амиго.");
                System.out.println("");
        System.out.println("Я согласен на зарплату $800/месяц в первый год.");
                System.out.println("Я согласен на зарплату $1500/месяц во второй год.");
                        System.out.println("Я согласен на зарплату $2200/месяц в третий год.");
                                System.out.println("Я согласен на зарплату $2700/месяц в четвертый год.");
                                        System.out.println("Я согласен на зарплату $3200/месяц в пятый год.");
                                                System.out.println(""); */
       /* String a = "Меня зовут Амиго.";
        String b = "Я согласен на зарплату $800/месяц в первый год.";
                                                System.out.println(a + "\n" + b); */

    // System.out.println("Вывести \\ символ");

       /* int a = 5;
         int d = 18;
        int c = a + d;
        String b = " is better than ";
        System.out.println(a + b + c);  */

       /*
        System.out.println(sqr(5));
    public static int sqr(int a) {
        return a * a; }  - квадрат числа 5 */


    /*     huh(2,2);
           }
    public static void huh(int a, int b) {
        int c = a + b;
        System.out.print(c);  - сумма чисел 2+2 = 4   */

       /* print("Java easy to learn!");
        print("Java opens many opportunities!");
        }
    public static void print(String s) {
        System.out.println(s);    */


      /*  hackSalary(700);
          }
    public static void hackSalary(int a) {
        System.out.println("Твоя зарплата составляет: " +(a+100)+ " долларов в месяц.");  */


     /*   printCircleLength(5);
    }
    public static void printCircleLength(int radius) {
        //double s = 2*3.14*radius;
        //System.out.println(s);
        System.out.println(2*3.14*radius);   */


       /*
        //В методе main создай объект Person, занеси его ссылку в переменную person.
        Person person = new Person();
        //ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
    }
    public static class Person {
        //напишите тут ваш код     */

     /*
        System.out.println(convertCelsiumToFahrenheit(41));
    }
    public static double convertCelsiumToFahrenheit(int celsium) {
        return 32.0+celsium*9.0/5.0;    */

     /*
        Man man = new Man();   //В методе main создай объект Man и сразу сохрани ссылку на него в переменную man.
        Woman woman = new Woman();   //В методе main создай объект Woman и сразу сохрани ссылку на него в переменную woman.
        man.wife = woman;   //	В методе main сохрани ссылку на ранее созданный объект Woman в man.wife.
        woman.husband = man;   //В методе main сохрани ссылку на ранее созданный объект Man в woman.husband.
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;  */


     /*
        Cat cat8 = new Cat();
        Cat cat9;
        cat8.name = "Lola";
        System.out.println(cat8.name);
    }
    public static class Cat {
 String name;   */


      /*  Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }
    public static class Cat {
        public Woman owner;
    }
    public static class Dog {
        public Woman owner;
    }
    public static class Fish {
        public Woman owner;
    }
    public static class Woman {   */



     /*   System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        //напишите тут ваш код
        double c = earthWeight * 0.17;
        return c;    */


      /*  print3("I love you!");
    }
        public static void print3(String s) {
            System.out.println(s);   */

       /* print3("window");
        print3("file");
    }
        public static void print3(String s) {
            //напишите тут ваш код
            System.out.println(s + " "+ s + " " + s);   */

/*
    public static int min(int a, int b) {
//        int m;
//        if (a < b) {
//            m = a;
//        } else {
//            m = b;
//        }
//        return m;

//        int result;
//        if (a < b) {
//            result = a;
//        } else {
//            result = b;
//        }
//        return result;

//        if (a < b) {
//            return a;
//        } else {
//            return b;
//        }

        //тернарный оператор ()?:
        //(условие)? <результат тру>: <результат фолс>

        return (a < b) ? a : b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));  */



/*
//    public static int min(int a, int b, int c) {
//        //напишите тут ваш код
//        int result;
//        if (a < b) result = a;
//        else result = b;
//        if (result < c)
//            return result;
//        else return c;
//    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 2));
        System.out.println(min(5, 1, 10));   */



/*
    public static int min(int a, int b, int c, int d) {
        // return min(min(a, b), min(c, d));
        int minAB = min(a, b);
        int minCD = min(c, d);

//        if (minAB < minCD)
//            return minAB;
//        else
//            return minCD;

        return min(minAB,minCD);
    }

    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));    */

  /*  public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public static int min(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }

    public static int min(int... numbers) {
        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            minNumber = min(minNumber, numbers[i + 1]);
        }
        return minNumber;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 2, 2, 3, 4, 5, 0));
        System.out.println(min(12, 22, 24, 23, 35, 44, 52, 10));
        System.out.println(min(12, 22, 24, 23, 35, 44, 52, 10, 2));
        System.out.println(min(12, 22, 24, 23, 35, 44, 52, 10, 6, 1, 9));   } */

    /*    div(6, 3);
        div(10, 6);
        div(2, 4);
    }
    public static void div(int a, int b) {
        System.out.println(a/b);   */



    /*    Cat cat = new Cat();
        System.out.println(cat.name);
        changeName(cat);
        System.out.println(cat.name);
    }
    public static void changeName(Cat cat) {
        cat.name = "Jerry";
    }
    public static class Cat {
        String name = "Tom";   */

       /* public static void printString(String s){
            System.out.println(s);
        }

        public static void main(String[] args) {
            printString("Hello, Amigo!"); */


     /*   System.out.println(convertEurToUsd(4, 0.9));
        System.out.println(convertEurToUsd(10, 0.9));
    }
    public static double convertEurToUsd(int eur, double course) {
        double u = eur * course;
        return u;
       // return eur * course;*/


      /*  System.out.println(addTenPercent(9)); }
        public static double addTenPercent(int i) {
        return i * 1.1;   */


    //    System.out.println(2 * (3 + 4 * (5 + 6 * 7)));   //382




    /*    Zerg alina = new Zerg();
        alina.name = "Alina";
        Protoss vasia = new Protoss();
        vasia.name = "Vasia";
        Terran terran1 = new Terran();
        terran1.name = "Ula";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;   */



      /*  //Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):

        int a = 0;
        for (int i = 1; i<6; i++ ){
            a = a + i;
            System.out.println(a);
        }   */



     /*   writeToConsole("Hello world!");
    }
    public static void writeToConsole(String s) {
        System.out.println("printing: "+s);  */


     /*   System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(4));
    }
        public static int convertToSeconds(int hour){
            return hour*3600;   */



      /*  Red red = new Red();
    }
    public static class Red {
        public Red() {
            System.out.println("Red");
        }  */


    // System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");

    // System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");






//Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".


    // public static void main(String[] args) throws Exception {
          /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String name = bufferedReader.readLine();
            int salary = Integer.parseInt(bufferedReader.readLine());
            int year = Integer.parseInt(bufferedReader.readLine());
            System.out.println(name + " get " + salary + " after " + year + " years.");  */

          /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String name = bufferedReader.readLine();
            int years = Integer.parseInt(bufferedReader.readLine());
            System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");   */

         /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          String name1 = bufferedReader.readLine();
          String name2 = bufferedReader.readLine();
          int years1 = Integer.parseInt(bufferedReader.readLine());
          System.out.println(name1 + " + " + name2 + "  are friends " + years1 + " years");  */





       /* int i = 0;
        while (i<5) {
            System.out.println("я хочу большую зарплату, и для этого изучаю Java.");
            i = i+1;
        }   */





       System.out.println(sumDigitsInNumber(546));
    }
    public static int sumDigitsInNumber(int number) {
/* int a = number / 100; //5
int b = (number - (a * 100))/10; // (546 -500)=46/10=4
        int c = number/10; //54
        int d = (number - (c*10)); // 546-540 = 6
return a+b+d;  //  */

      int a = number/100; //5
      int b= (number/10 )% 10; //4
      int c= number % 10; //6
        return a+b+c;  }


     /*   Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("Age in adjustAge() is: " + age);
        }
    }  */


      /*  Cat cat1 = new Cat();
        cat1.count = Cat.count + 1;
        Cat cat2 = new Cat();
        cat2.count = Cat.count + 1;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }  */


     /*  //ближайшее число к 10
      displayClosestToTen(8, 11);
        displayClosestToTen(7, 13);
    }

    public static void displayClosestToTen(int a, int b) {
        if (abs(a - 10) < abs(b - 10)) {
            System.out.println(a);
        } else if (abs(a - 10) == abs(b - 10)) {
            System.out.println(a + ", " + b);
        } else {
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }  */



        /*   //интервал

         checkInterval(60);
            checkInterval(112);
            checkInterval(10);
        }

        public static void checkInterval(int a) {
            //напишите тут ваш код
            if (a>=50 && a<=100){
                System.out.println("Число " +a+ " содержится в интервале.");
            }
            else {
                System.out.println("Число " +a+ " не содержится в интервале.");
            }
        }  */


  /*  //сезон
  checkSeason(12);
    checkSeason(4);
    checkSeason(7);
    checkSeason(10);
}
public static void checkSeason(int month) {
        if (3<= month && 5>= month){
            System.out.println("весна");
        }
        else if (6<= month || 8>= month){
            System.out.println("лето");}
        else if (9>=month || 11>= month) {
            System.out.println("осень");
        }
        else {
            System.out.println("зима");
        }
    }  */





}




