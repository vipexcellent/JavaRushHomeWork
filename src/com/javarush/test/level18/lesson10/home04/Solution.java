package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(firstFile);
        FileInputStream fileInputStream2 = new FileInputStream(reader.readLine());

        FileOutputStream fileOutputStream = new FileOutputStream(firstFile);

        byte[] buffer = new byte[fileInputStream1.available()];

        /*while (fileInputStream.available() > 0)
        {
            int length = fileInputStream.read(buffer);
            fileOutputStream.write(buffer, 0 , length);
        }

        fileInputStream.close();*/
        fileOutputStream.close();
        reader.close();
    }
}
