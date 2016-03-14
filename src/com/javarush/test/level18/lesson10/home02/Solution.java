package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        int count = 0;
        int countAll = 0;

        if (args.length > 0)
        {
            FileInputStream inputStream = new FileInputStream(args[0]);
            countAll = inputStream.available();

            while (inputStream.available() > 0)
            {
                if (inputStream.read() == Integer.valueOf(' '))
                {
                    count++;
                }
            }
            inputStream.close();
        }

        if (countAll > 0) System.out.printf("%.2f", (double) count/countAll * 100);

    }
}
