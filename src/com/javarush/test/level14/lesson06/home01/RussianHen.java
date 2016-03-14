package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Анастасия on 09.12.2015.
 */

public class RussianHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 10;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
