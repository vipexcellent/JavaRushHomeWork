package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String surname;
        int age;
        boolean sex;
        String position;
        double salary;

        public Human()
        {
        }

        public Human(String surname)
        {
            this.surname = surname;
        }

        public Human(String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String surname, int age, boolean sex, String position, double salary)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.position = position;
            this.salary = salary;
        }

        public Human(String name, String position, boolean sex, int age, String surname)
        {
            this.name = name;
            this.position = position;
            this.sex = sex;
            this.age = age;
            this.surname = surname;
        }
    }
}
