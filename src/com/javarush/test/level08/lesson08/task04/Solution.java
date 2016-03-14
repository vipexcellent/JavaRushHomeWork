package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 2 1980"));
        map.put("Stallone3", new Date("JANUARY 1 1980"));
        map.put("Stallone4", new Date("JULY 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("FEBRUARY 1 1980"));
        map.put("Stallone7", new Date("NOVEMBER 1 1982"));
        map.put("Stallone8", new Date("NOVEMBER 1 1985"));
        map.put("Stallone9", new Date("NOVEMBER 1 1989"));
        map.put("Stallone10", new Date("AUGUST 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7)
                iterator.remove();
        }
    }
}
