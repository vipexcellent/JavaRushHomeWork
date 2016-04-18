package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1], true));

        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();

        String line;

        while ((line = reader.readLine()) != null) {
            strings.add(line);
        }

        for (String s : strings) {
            String[] splits = s.split(" ");
            for (String split : splits) {
                if (split.length() > 6) result.add(split);
            }
        }

        String resultString = "";
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1)
                resultString += result.get(i);
            else
                resultString += result.get(i) + ",";
        }

        writer.write(resultString);

        reader.close();
        writer.close();
    }
}
