package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        byte[] buff = new byte[inputStream.available()];

        while (inputStream.available() > 0)
        {
            int count = inputStream.read(buff);
            for (int i = 0; i < buff.length / 2; i++)
            {
                byte b = buff[i];
                buff[i] = buff[buff.length - i - 1];
                buff[buff.length - i - 1] = b;
            }

            outputStream.write(buff, 0, count);
        }

        inputStream.close();
        outputStream.close();
        reader.close();
    }
}
