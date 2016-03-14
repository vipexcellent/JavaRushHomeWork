package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();

        map.put("f1", "Vasya");
        map.put("f2", "Basya");
        map.put("f3", "Vasya2");
        map.put("f4", "Basya2");
        map.put("f5", "Vasya3");
        map.put("f6", "Basya");
        map.put("f7", "Vasya");
        map.put("f8", "Basya4");
        map.put("f9", "Vasya5");
        map.put("f10", "Basya5");

        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (String s: copy.values()){
            int count = 0;
            for (String check : copy.values())
            {
                if (s.equals(check)) count++;

            }
            if (count > 1) removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
