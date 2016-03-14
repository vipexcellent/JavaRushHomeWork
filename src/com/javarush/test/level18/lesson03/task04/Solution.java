package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min = 300;

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (map.containsValue(data)){
                map.put(data, map.get(data) + 1);
            }
            else {
                map.put(data, 1);
            }
        }

        for (Integer i : map.values()){
            if (i < min) min = i;
        }

        for(Map.Entry<Integer, Integer> pair : map.entrySet())
        {
            if (pair.getValue() == min) System.out.print(pair.getKey() + " ");
        }

        inputStream.close();
        reader.close();
    }
}
