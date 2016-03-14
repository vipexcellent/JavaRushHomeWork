package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("MAY 1 2015"));
        System.out.println(isDateOdd("MAY 2 2015"));
    }

    public static boolean isDateOdd(String date)
    {
        Date d = new Date(date);
        Date d2 = new Date();
        d2.setHours(0);
        d2.setMinutes(0);
        d2.setSeconds(0);

        d2.setDate(1);
        d2.setMonth(0);
        d2.setYear(d.getYear());

        long timeDistance = d2.getTime() - d.getTime();

        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (timeDistance / msDay);

        if (dayCount % 2 == 0)
        {
            return false;
        }
        return true;
    }
}
