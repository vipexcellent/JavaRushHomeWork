package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1], true));

        List<String> strings = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            strings.add(line);
        }

        for (String s : strings) {
            String stringWithNumbers = "";
            String[] splits = s.split(" ");

            for (String split : splits) {
                if (split.matches(".*\\d.*")) stringWithNumbers += split + " ";
            }

            writer.write(stringWithNumbers);
        }

        reader.close();
        writer.close();
    }
}
