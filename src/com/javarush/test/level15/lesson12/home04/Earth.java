package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Анастасия on 16.12.2015.
 */
public class Earth implements Planet
{
    private static Earth _instance = null;

    private Earth()
    {
    }

    public synchronized static Earth getInstance()
    {
        if (_instance == null)
        {
            _instance = new Earth();
        }
        return _instance;
    }

}
