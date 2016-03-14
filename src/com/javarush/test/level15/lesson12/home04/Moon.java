package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Анастасия on 16.12.2015.
 */
public class Moon implements Planet
{
    private static Moon _instance = null;

    private Moon()
    {
    }

    public synchronized static Moon getInstance()
    {
        if (_instance == null)
        {
            _instance = new Moon();
        }
        return _instance;
    }
}
