package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m[] = new int[3];
        for (int i = 0; i < 3; i ++)
        {
            m[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 3; i ++){
            for (int j = i + 1; j < 3; j++){
                if (m[i] < m[j]){
                    int c = m[i];
                    m[i] = m[j];
                    m[j] = c;
                }
            }
        }

        for (int i = 0; i < 3; i ++)
            System.out.println(m[i]);


    }
}
