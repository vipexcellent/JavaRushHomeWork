package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename1 = reader.readLine();
        String filemame2 = reader.readLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filemame2));

        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            String[] splits = line.split(" ");
            for (int i = 0; i < splits.length; i++)
            {
                if (splits[i].matches("[-+]?\\d+")){
                    bufferedWriter.write(splits[i] + " ");
                }
            }
        }

        reader.close();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
