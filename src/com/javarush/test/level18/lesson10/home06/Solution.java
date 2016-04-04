package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{

        FileInputStream inputStream = new FileInputStream(args[0]);
        Map<Character, Integer> map = new TreeMap<>();
        byte[] buffer = new byte[inputStream.available()];
        char[] chars;

        while (inputStream.available() > 0)
        {
            inputStream.read(buffer);
        }

        chars = new String(buffer).toCharArray();

        for (char  c : chars){
            if (map.containsKey(c)){
                int value = map.get(c) + 1;
                map.put(c, value);
            }
            else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        inputStream.close();

    }
}
