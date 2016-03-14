package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        OutputStream outStream = new FileOutputStream(filename);
        List<String> list = new ArrayList<String>();

        while (true)
        {
            String s = reader.readLine();
            list.add(s + " \n");
            if (s.equals("exit"))
            {
                for (String str : list)
                {
                    outStream.write(str.getBytes());
                }
                break;
            }

        }

        outStream.close();

    }
}
