package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedReader reader1 = new BufferedReader(new FileReader(filename));
        List<Integer> list = new ArrayList<Integer>();

        String line;
        while ((line = reader1.readLine()) != null)
        {
            if (isNumber(line) && Integer.parseInt(line) % 2 == 0)
            {
                list.add(Integer.parseInt(line));
            }
        }

        sort(list);
        for (Integer i : list)
        {
            System.out.println(i);
        }
    }

    public static void sort(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j ++)
            {
                if (list.get(i) > list.get(j))
                {
                    int c = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, c);
                }
            }
        }
    }

    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
