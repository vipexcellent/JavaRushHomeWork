package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Анастасия on 18.12.2015.
 */
public class Hrivna extends Money
{

    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}
