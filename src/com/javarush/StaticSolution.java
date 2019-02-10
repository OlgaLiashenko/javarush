package com.javarush;

public class StaticSolution {
    public static void main(String[] args) {

        Person person = new Person();  //new Person() - создаю новый экзепляр класса instance. person - ссылка на instance
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
        person.adjustAgeMore(person.age);
        System.out.println("Adjusted age is: " + person.age);

        Person person2 = new Person();
        System.out.println("Age is: " + person2.age);
        person2.adjustAge(person2.age);
        System.out.println("Adjusted age is: " + person2.age);

        Person person3 = new Person();
        System.out.println("Age is: " + person3.age);
        person3.adjustAge(person2.age);
        System.out.println("Adjusted age is: " + person3.age);
        person3.adjustAgeMore(person.age);
        System.out.println("Adjusted age is: " + person3.age);

        person = person3;
        System.out.println("Adjusted age is: " + person.age);
        person.age = 3;
        System.out.println("Adjusted age is: " + person3.age);

        System.out.println();

    }

    public static class Person {
        public int age = 20; //40 // 81

        public void adjustAge(int age) {
            this.age = age + 20; // this ссылается на тот instance, на котором был создан - на person.
                                // this.age ссылается на person.age
            System.out.println("age= " + age);
            System.out.println("this.age= " + this.age);
        }

        public void adjustAgeMore(int age) {
                this.age = age * 2 + 1;
                System.out.println("age= " + age);
                System.out.println("this.age= " + this.age);
        }
    }
}
