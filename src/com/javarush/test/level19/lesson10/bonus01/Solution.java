package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        List<String> file1 = new ArrayList<>();
        List<String> file2 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2));

        String line;
        while ((line = fileReader1.readLine()) != null) {
            file1.add(line);
        }

        while ((line = fileReader2.readLine()) != null) {
            file2.add(line);
        }

        fileReader1.close();
        fileReader2.close();

        int count1 = 0;
        int count2 = 0;

        while (count1 < file1.size() && count2 < file2.size()) {

            if (file1.get(count1).equals(file2.get(count2))) {
                linesAddSAME(file1.get(count1));
                count1++;
                count2++;
            }
            else if (file1.size() > count1 + 1 && file1.get(count1 + 1).equals(file2.get(count2))) {
                linesAddREMOVED(file1.get(count1));
                count1++;
            }
            else if (file2.size() > count2 + 1 && file2.get(count2 + 1).equals(file1.get(count1))) {
                linesAddADDED(file2.get(count2));
                count2++;
            }
        }
        if (count1 < file1.size()) {
            linesAddREMOVED(file1.get(count1));
        }
        if (count2 < file2.size()) {
            linesAddADDED(file2.get(count2));
        }


        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i).type.toString() + " " + lines.get(i).line);
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }

    public static void linesAddSAME (String line) {
        lines.add(new LineItem(Type.SAME, line));
    }

    public static void linesAddADDED (String line) {
        lines.add(new LineItem(Type.ADDED, line));
    }

    public static void linesAddREMOVED (String line) {
        lines.add(new LineItem(Type.REMOVED, line));
    }

}



