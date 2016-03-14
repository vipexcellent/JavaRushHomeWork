package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        List<Human> list = new ArrayList<Human>();
        list.add(new Human("Василий", true, 12));
        list.add(new Human("Егор", true, 11));
        list.add(new Human("Мария", false, 11));
        List<Human> children = new ArrayList<Human>();
        for (Human human : list)
            children.add(human);
        list.add(new Human("Анна", false, 35, children));
        list.add(new Human("Константин", true, 36, children));

        children = new ArrayList<Human>();
        children.add(list.get(3));

        list.add(new Human("Ольга", false, 55, children ));
        list.add(new Human("Иван", true, 56, children));

        children = new ArrayList<Human>();
        children.add(list.get(4));

        list.add(new Human("Вера", false, 55, children ));
        list.add(new Human("Павел", true, 56, children));

        for (Human human : list)
            System.out.println(human);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<Human>();

        public Human()
        {
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, List<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(children);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
