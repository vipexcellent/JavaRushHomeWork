package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse jerryMouse2 = new Mouse("Jerry2", 5 , 8);
        Cat cat1 = new Cat("Tom", "Tomich", 5);
        Cat cat2 = new Cat("Bel", "Belich", 5);
        Cat cat3 = new Cat("Yii", "Yiiich", 5);
        Dog dog1 = new Dog("Tom", "Tomich", 5);
        Dog dog2 = new Dog("Bel", "Belich", 5);
        Dog dog3 = new Dog("Yii", "Yiiich", 5);


        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        String surname;
        int age;

        public Cat(String name, String surname, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
    }

    public static class Dog
    {
        String name;
        String surname;
        int age;

        public Dog(String name, String surname, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
    }
    //добавьте тут ваши классы

}
