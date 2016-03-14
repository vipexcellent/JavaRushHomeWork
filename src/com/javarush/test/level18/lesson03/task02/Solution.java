package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int min = 300;
        int buffer;

        while(inputStream.available() > 0)
        {
            buffer = inputStream.read();
            if (buffer < min) min = buffer;
        }

        System.out.println(min);

        inputStream.close();
        reader.close();
    }
}
