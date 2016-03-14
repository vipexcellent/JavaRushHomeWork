package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Анастасия on 16.12.2015.
 */
public class Sun implements Planet
{
    private static Sun _instance = null;

    private Sun()
    {
    }

    public synchronized static Sun getInstance()
    {
        if (_instance == null)
        {
            _instance = new Sun();
        }
        return _instance;
    }
}
