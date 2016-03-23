package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner input = new Scanner(new FileInputStream(reader.readLine()));
        input.useLocale(Locale.ENGLISH);
        BufferedWriter output = new BufferedWriter(new FileWriter(reader.readLine()));

        List<Double> numbers = new ArrayList<>();
        while (input.hasNext()) {
            numbers.add(input.nextDouble());
        }

        for (Double number : numbers){
            output.write(Math.round(number) + " ");
        }

        reader.close();
        input.close();
        output.close();
    }
}

