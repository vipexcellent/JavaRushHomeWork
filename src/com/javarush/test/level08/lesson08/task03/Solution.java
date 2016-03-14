package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Ivanov1", "Ivan");
        map.put("Sidorov2", "Ivan");
        map.put("Petrenko3", "Petr");
        map.put("Diachenko4", "Igor");
        map.put("Alexandrov5", "Alex");
        map.put("Ivanova6", "Ivanna");
        map.put("Sidorova7", "Anna");
        map.put("Petrova8", "Olga");
        map.put("Petrov9", "Vasiliy");
        map.put("Fedorov10", "Alexandr");

        return (HashMap<String, String>) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (String value : map.values())
        {
            if (value.equals(name))  count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (String key : map.keySet())
        {
            if (key.equals(lastName)) count++;
        }
        return count;
    }
}
