package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int max = 0;
        int buffer;

        while (inputStream.available() > 0)
        {
            buffer = inputStream.read();
            if (buffer > max)  max = buffer;
        }

        System.out.println(max);

        inputStream.close();
        reader.close();
    }
}
