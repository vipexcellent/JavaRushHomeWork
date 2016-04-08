package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    private static byte key = 10;

    private static byte[] crypt(byte[] data) {
        byte[] bufffer = new byte[data.length];

        for (int i = 0; i < data.length; i++) {
            bufffer[i] = (byte)(data[i] ^ key);
        }

        return bufffer;
    }

    public static void main(String[] args) throws IOException{

        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

        byte[] data = new byte[fileInputStream.available()];

        while (fileInputStream.available() > 0) {
            fileInputStream.read(data);
            fileOutputStream.write(crypt(data));
        }

        fileInputStream.close();
        fileOutputStream.close();

    }

}
