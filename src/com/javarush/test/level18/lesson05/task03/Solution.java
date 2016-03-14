package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        byte[] buff1;
        byte[] buff2;

        if (inputStream.available() % 2 == 0) {
            buff1 = new byte[inputStream.available()/2];
            buff2 = new byte[inputStream.available()/2];
        } else {
            buff1 = new byte[inputStream.available()/2 + 1];
            buff2 = new byte[inputStream.available()/2];
        }

        while (inputStream.available() > 0)
        {
            outputStream1.write(buff1, 0, inputStream.read(buff1));
            outputStream2.write(buff2, 0, inputStream.read(buff2));
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
        reader.close();
    }
}
