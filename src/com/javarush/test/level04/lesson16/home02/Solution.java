package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m[] = new int[3];
        for(int i = 0; i < 3; i++){
            m[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < 3; i ++){
            for(int j = i + 1; j < 3; j ++){
                if (m[i] > m [j]){
                    int c = m[i];
                    m[i] = m[j];
                    m[j] = c;
                }
            }
        }

        System.out.println(m[1]);

    }
}
