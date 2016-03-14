package com.javarush.test.level14.lesson06.home01;

import com.javarush.test.level12.lesson04.task02.*;

/**
 * Created by Анастасия on 09.12.2015.
 */
public class UkrainianHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 14;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}